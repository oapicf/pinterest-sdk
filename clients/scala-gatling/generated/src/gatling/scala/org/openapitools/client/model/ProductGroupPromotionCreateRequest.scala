
package org.openapitools.client.model


case class ProductGroupPromotionCreateRequest (
    /* ID of the Ad Group the Product Group Promotion belongs to. */
    _adGroupId: String,
    _productGroupPromotion: List[ProductGroupPromotion]
)
object ProductGroupPromotionCreateRequest {
    def toStringBody(var_adGroupId: Object, var_productGroupPromotion: Object) =
        s"""
        | {
        | "adGroupId":$var_adGroupId,"productGroupPromotion":$var_productGroupPromotion
        | }
        """.stripMargin
}
