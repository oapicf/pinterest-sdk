package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param adGroupId ID of the ad group the product group promotion belongs to.
  * @param productGroupPromotion List of product group promotions to create or update.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ProductGroupPromotionsCreate(
  adGroupId: String,
  productGroupPromotion: List[ProductGroupPromotion]
)

object ProductGroupPromotionsCreate {
  implicit lazy val productGroupPromotionsCreateJsonFormat: Format[ProductGroupPromotionsCreate] = Json.format[ProductGroupPromotionsCreate]
}

