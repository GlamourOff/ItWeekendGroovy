package com.it.weekend.operation

class ArithmeticOperation {

    private static class Balance {
        BigInteger credit
        BigInteger debit


        Balance plus(Balance balance) {
            new Balance(
                credit: this.credit + balance.credit,
                debit: this.debit + balance.debit
            )
        }

        Balance minus(Balance balance) {
            new Balance (
                credit: this.credit - balance.credit,
                debit: this.debit - balance.debit
            )
        }
    }


    static void main(args) {
        def fatherBalance = new Balance(credit: -100, debit: 100)
        def motherBalance = new Balance(credit: -50, debit: 50)
        def sonBalance = new Balance(credit: -10, debit: 10)

        def balance = fatherBalance + motherBalance + sonBalance
        println "Total balance is: credit = $balance.credit, debit = $balance.debit"
    }
}
