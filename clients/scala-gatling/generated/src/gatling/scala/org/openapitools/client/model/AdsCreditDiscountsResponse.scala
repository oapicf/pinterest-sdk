
package org.openapitools.client.model


case class AdsCreditDiscountsResponse (
    /* True if the offer code is currently active. */
    _active: Option[Boolean],
    /* Advertiser ID the offer was applied to. */
    _advertiserId: Option[String],
    /* The type of discount of this credit */
    _discountType: Option[String],
    /* The discount applied in the offer’s currency value. */
    _discountInMicroCurrency: Option[Number],
    /* Currency value for the discount. */
    _discountCurrency: Option[String],
    /* Human readable title of the offer code. */
    _title: Option[String],
    /* The credits left to spend. */
    _remainingDiscountInMicroCurrency: Option[Number]
)
object AdsCreditDiscountsResponse {
    def toStringBody(var_active: Object, var_advertiserId: Object, var_discountType: Object, var_discountInMicroCurrency: Object, var_discountCurrency: Object, var_title: Object, var_remainingDiscountInMicroCurrency: Object) =
        s"""
        | {
        | "active":$var_active,"advertiserId":$var_advertiserId,"discountType":$var_discountType,"discountInMicroCurrency":$var_discountInMicroCurrency,"discountCurrency":$var_discountCurrency,"title":$var_title,"remainingDiscountInMicroCurrency":$var_remainingDiscountInMicroCurrency
        | }
        """.stripMargin
}
