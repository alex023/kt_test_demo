package com.iciyun.list02

//
//import io.kotlintest.properties.Gen
//import io.kotlintest.properties.forAll
//import io.kotlintest.properties.generateInfiniteSequence
//import io.kotlintest.specs.StringSpec

//
//
//class DonutShopTest : StringSpec() {
//    init {
//        "buyDonut" {
//            forAll(CreditCardGenerator()) { creditCard: CreditCard ->
//                val purchase1 = buyDonuts(creditCard)
//                val purchase2 = buyDonuts(creditCard)
//                val combinedPayments = purchase1.payment.combine(purchase2.payment)
//                combinedPayments.amount == Donut.price * 2
//            }
//            forAll(CreditCardGenerator()) { creditCard: CreditCard ->
//                val purchase1 = buyDonuts(creditCard)
//                val purchase2 = buyDonuts(creditCard)
//                val combinedPayments = purchase1.payment.combine(purchase2.payment)
//                combinedPayments.creditCard == creditCard
//            }
//        }
//    }
//}
//
