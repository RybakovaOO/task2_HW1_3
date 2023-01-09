fun main(){
        val vkPay = 1
        val masterCard = 2
        val visa = 3
        val commissionVisa = 0.0075
        val commissionMasterCard = 0.006
        val minCommissionVisa = 35

        fun calculateCommission(card: Int = 1, transfersThisMonth: Int = 0, transferAmount: Int) {
                val commission = when (card){
                        2 -> if (transfersThisMonth > 75000) transferAmount*commissionMasterCard + 20 else 0
                        3 -> if (transferAmount * commissionVisa < minCommissionVisa) minCommissionVisa else
                                transferAmount * commissionVisa
                        else -> 0
                }
                println("Комиссия за перевод составит: $commission руб")
        }
        calculateCommission(2, 100000, 1000)
}