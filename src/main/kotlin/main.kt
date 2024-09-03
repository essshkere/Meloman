fun main() {
    val amountRegular = 15000
    val amountNew = 15000

    val minDiscount = 100
    val maxDiscount = 0.95
    val regularDiscount = 0.99

    val amountRegularDiscount =
        if (amountRegular > 1000 && amountRegular < 10_001)
            (amountRegular - minDiscount) * regularDiscount
        else if (amountRegular > 10000) amountRegular * maxDiscount * regularDiscount
        else amountRegular * regularDiscount
    val amountNewDiscount =
        if (amountNew > 1000 && amountNew < 10_001) amountNew - minDiscount
        else if (amountNew > 10000) amountNew * maxDiscount
        else amountNew

    val totalAmountRegular = amountRegularDiscount.toInt()
    val totalAmountNew = amountNewDiscount.toInt()
    println("Стоимость для постоянного клиента: $totalAmountRegular руб.")
    println("Стоимость для нового клиента $totalAmountNew руб.")

}