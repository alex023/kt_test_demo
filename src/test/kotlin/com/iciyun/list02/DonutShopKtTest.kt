package com.iciyun.list02

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.RepeatedTest

//import io.kotlintest.properties.Gen
//import io.kotlintest.properties.forAll
//import io.kotlintest.properties.generateInfiniteSequence
//import io.kotlintest.specs.StringSpec

class DonutShopKtTest {

    @Test
    @RepeatedTest(100)
    fun buyDonuts() {
        val creditCard = CreditCard()
        val purchase1 = buyDonuts(creditCard)
        val purchase2 = buyDonuts(creditCard)
        val combinedPayments = purchase1.payment.combine(purchase2.payment)
        assertEquals(combinedPayments.amount, Donut.price * 2)
    }

}