package com.iciyun.list02


class Payment(val creditCard: CreditCard, val amount: Int) {
//    private val log: Log = LogFactory.getLog(Payment.class)
        fun combine(payment: Payment): Payment =
            if (creditCard == payment.creditCard)
                Payment(creditCard, amount + payment.amount)
            else
                throw IllegalStateException("Cards don't match.")

                        operator fun component1(): CreditCard = creditCard

                        operator fun component2(): Int = amount


                        companion object {
                    fun groupByCard(payments: List<Payment>): List<Payment> {
                        return payments.groupBy { it.creditCard }
                            .values
                            .map { it.reduce(Payment::combine) }
                    }
                }
}