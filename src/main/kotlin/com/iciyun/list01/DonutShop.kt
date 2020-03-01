package com.iciyun.list01

fun buyDonut(creditCard: CreditCard): Donut {
    val donut = Donut()
    creditCard.charge(Donut.price)
    return donut
}