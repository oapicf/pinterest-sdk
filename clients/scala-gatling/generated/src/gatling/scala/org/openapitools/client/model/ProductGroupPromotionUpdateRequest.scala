
package org.openapitools.client.model


case class ProductGroupPromotionUpdateRequest (
    /* ID of the ad group the product group belongs to. */
    _adGroupId: String,
    _productGroupPromotion: List[ProductGroupPromotion]
)
object ProductGroupPromotionUpdateRequest {
    def toStringBody(var_adGroupId: Object, var_productGroupPromotion: Object) =
        s"""
        | {
        | "adGroupId":$var_adGroupId,"productGroupPromotion":$var_productGroupPromotion
        | }
        """.stripMargin
}
