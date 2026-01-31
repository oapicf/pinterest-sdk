
package org.openapitools.client.model


case class AdsCreditDiscountsResponse (
    /* True if the offer code is currently active. */
    _active: Option[Boolean],
    /* Advertiser ID the offer was applied to. */
    _advertiserId: Option[String],
    /* Currency value for the discount. */
    _discountCurrency: Option[String],
    /* The discount applied in the offer’s currency value. */
    _discountInMicroCurrency: Option[Number],
    /* The type of discount of this credit */
    _discountType: Option[String],
    /* The credits left to spend. */
    _remainingDiscountInMicroCurrency: Option[Number],
    /* Human readable title of the offer code. */
    _title: Option[String]
)
object AdsCreditDiscountsResponse {
    def toStringBody(var_active: Object, var_advertiserId: Object, var_discountCurrency: Object, var_discountInMicroCurrency: Object, var_discountType: Object, var_remainingDiscountInMicroCurrency: Object, var_title: Object) =
        s"""
        | {
        | "active":$var_active,"advertiserId":$var_advertiserId,"discountCurrency":$var_discountCurrency,"discountInMicroCurrency":$var_discountInMicroCurrency,"discountType":$var_discountType,"remainingDiscountInMicroCurrency":$var_remainingDiscountInMicroCurrency,"title":$var_title
        | }
        """.stripMargin
}
