
package org.openapitools.client.model


case class BillingProfilesResponse (
    /* Billing ID. */
    _id: Option[String],
    /* Type of the card. */
    _cardType: Option[String],
    /* Status of the billing. */
    _status: Option[String],
    /* Advertiser ID of the billing. */
    _advertiserId: Option[String],
    /* Brand of the payment method. */
    _paymentMethodBrand: Option[String]
)
object BillingProfilesResponse {
    def toStringBody(var_id: Object, var_cardType: Object, var_status: Object, var_advertiserId: Object, var_paymentMethodBrand: Object) =
        s"""
        | {
        | "id":$var_id,"cardType":$var_cardType,"status":$var_status,"advertiserId":$var_advertiserId,"paymentMethodBrand":$var_paymentMethodBrand
        | }
        """.stripMargin
}
