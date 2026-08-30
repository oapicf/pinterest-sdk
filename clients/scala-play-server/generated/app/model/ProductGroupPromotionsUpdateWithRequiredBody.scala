package model

import play.api.libs.json._

/**
  * Resource create or update operation model with required body fields (no OptionalProperties).
  * @param adGroupId ID of the ad group the product group promotion belongs to.
  * @param productGroupPromotion List of product group promotions to create or update.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ProductGroupPromotionsUpdateWithRequiredBody(
  adGroupId: String,
  productGroupPromotion: List[ProductGroupPromotion]
)

object ProductGroupPromotionsUpdateWithRequiredBody {
  implicit lazy val productGroupPromotionsUpdateWithRequiredBodyJsonFormat: Format[ProductGroupPromotionsUpdateWithRequiredBody] = Json.format[ProductGroupPromotionsUpdateWithRequiredBody]
}

