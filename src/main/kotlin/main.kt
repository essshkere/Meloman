fun main() {
    val amount = 15000
    val statusCustomer = true
    val minDiscount = 100
    val maxDiscount = 0.95
    val regularDiscount = 0.99

    val amountDiscount =
        if (!statusCustomer) {
            if (amount > 1000 && amount < 10_001)
                amount - minDiscount
            else if (amount > 10000) amount * maxDiscount
            else amount
        } else {
            if (amount > 1000 && amount < 10_001)
                (amount - minDiscount) * regularDiscount
            else if (amount > 10000) amount * maxDiscount * regularDiscount
            else amount * regularDiscount
        }
    val totalAmount = amountDiscount.toInt()
    println("Стоимость покупки: $totalAmount руб.")

}