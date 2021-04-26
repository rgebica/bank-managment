package pl.edu.pwsztar

import spock.lang.Specification

class BankOperationTest extends Specification {
    def "create account test"() {
        given: "initial data"
        Bank bank = new Bank();

        then: "create user account"
        bank.createAccount()
    }

    def "DeleteAccount"() {
    }

    def "Deposit"() {
    }

    def "Withdraw"() {
    }

    def "Transfer"() {
    }

    def "AccountBalance"() {
    }

    def "SumAccountsBalance"() {
    }
}
