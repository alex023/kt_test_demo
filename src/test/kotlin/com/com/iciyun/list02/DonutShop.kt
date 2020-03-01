package com.iciyun.list02

fun buyDonuts(creditCard: CreditCard, quantity: Int = 1): Purchase =
    Purchase(List(quantity) { Donut()}, Payment(creditCard, Donut.price * quantity))