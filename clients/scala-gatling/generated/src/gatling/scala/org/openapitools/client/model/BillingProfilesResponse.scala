
package org.openapitools.client.model


case class BillingProfilesResponse (
    /* Advertiser ID of the billing. */
    _advertiserId: Option[String],
    /* Billing type of the advertiser */
    _billingType: Option[BillingType],
    /* Type of the card. */
    _cardType: Option[BillingProfileCardType],
    /* Billing ID. */
    _id: Option[String],
    /* Brand of the payment method. */
    _paymentMethodBrand: Option[BillingProfilePaymentMethodBrand],
    /* Status of the billing. */
    _status: Option[BillingProfileStatus]
)
object BillingProfilesResponse {
    def toStringBody(var_advertiserId: Object, var_billingType: Object, var_cardType: Object, var_id: Object, var_paymentMethodBrand: Object, var_status: Object) =
        s"""
        | {
        | "advertiserId":$var_advertiserId,"billingType":$var_billingType,"cardType":$var_cardType,"id":$var_id,"paymentMethodBrand":$var_paymentMethodBrand,"status":$var_status
        | }
        """.stripMargin
}
