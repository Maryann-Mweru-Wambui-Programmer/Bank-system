class Bank {

    fun customerDetails(){
        println("Enter your name: ")
        var customerName = readLine()!!
        println("WELCOME $customerName to ONA BANKING SERVICES")
    }
    fun customerTransactions(){
        println("Do you have an account here: (Enter yes or no)")
        var response1 = readLine()!!
        val res1 = "yes"
        val res2 = "no"
        var accountBalance = 3000
        if (res1 == response1.toLowerCase()){
            val transactions = mutableListOf<String>("withdrawals", "deposits", "closing")
            println("Which transaction do you want to make? ")
            var response2 = readLine()!!
            for (i in transactions){
                if (i == response2.toLowerCase()){
                    println("Your transaction is $response2")
                    if (i == "deposits"){
                        println("How much money do you want to deposit: ")
                        val amountDeposit = readLine()!!
                        println("You have deposited $amountDeposit")
                        val newDeposit = amountDeposit.toInt()
                        accountBalance = accountBalance + newDeposit
                        println("Your account balance is at: $accountBalance")
                    }
                    else if (i == "withdrawals"){
                        println("How much money do you want to withdraw? ")
                        val amountWithdraw = readLine()!!
                        var newWithdraw = amountWithdraw.toInt()
                        if (newWithdraw >= accountBalance){
                            println("You have insufficient funds to withdraw $amountWithdraw")
                            val possible = accountBalance - 500
                            println("The maximum amount you can withdraw is $possible")
                        }
                        else{
                            println("You have successfully withdrawn $amountWithdraw")
                        }
                    }
                    else if (i == "closing"){
                        println("Are you sure you want to close your ONA account: \n Press 1. Yes\n2. No")
                        val confirm = readLine()
                        if (confirm == "1"){
                            println("Your balance in the account is $accountBalance\n It will be deposited in 2 days.")
                            println("Thank you for Bsnking with us")
                        }
                        else if (confirm == "2"){
                            println("Thanks for staying with us!!")
                        }
                        else{
                            println("INVALID DATA")
                        }
                    }
                }

            }

        }
        else if (res2 == response1.toLowerCase()){
            println("Do you wish to open an account with us: \n 1. Yes\n2. No")
            val ans1 = readLine()!!
            if ((ans1.toLowerCase() == "yes") || (ans1.toInt() == 1)){
                println("Kindly enter your details below: ")
                println("Enter your full name: ")
                val name = readLine()!!
                println("Enter your ID and phone number: ")
                val contacts = readLine()!!
                println("Your name is $name and your contacts info are $contacts\nPress 1 to continue or 2 to stop the process")
                val ans2 = readLine()!!
                if (ans2.toInt() == 1){
                    println("Thank you for opening an account with us!!\n The minimum account balance is $5, please make your deposits")
                    println("How much do you wish to deposit? ")
                    val ans3 = readLine()!!
                    if (ans3.toInt() < 500){
                        var rem = ans3.toInt()
                        val balance = 500 - rem
                        println("You need to deposit $balance to make your account active")
                    }
                    else if (ans3.toInt() >= 500){
                        println("Thank you for depositing with us. You have $ans3 in your account")
                    }
                    else {
                        println("INVALID TRANSACTION")
                    }
                }
                else{
                    println("Process terminated !!")
                }

            }
            else{
                println("You need to open an account for you to access our services!")
            }

        }
        else{
            println("INVALID RESPONSE!!")
        }
    }

}
