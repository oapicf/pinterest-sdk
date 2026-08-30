
package org.openapitools.client.model


case class ProductGroupPromotionsUpdateWithRequiredBody (
    /* ID of the ad group the product group promotion belongs to. */
    _adGroupId: String,
    /* List of product group promotions to create or update. */
    _productGroupPromotion: List[ProductGroupPromotion]
)
object ProductGroupPromotionsUpdateWithRequiredBody {
    def toStringBody(var_adGroupId: Object, var_productGroupPromotion: Object) =
        s"""
        | {
        | "adGroupId":$var_adGroupId,"productGroupPromotion":$var_productGroupPromotion
        | }
        """.stripMargin
}
