package model

import play.api.libs.json._

/**
  * Wrapper model for ProductGroupPromotion.
  * @param items Response-only: created or updated product group promotions, or exceptions.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ProductGroupPromotions(
  items: Option[List[ProductGroupPromotionResponseItem]]
)

object ProductGroupPromotions {
  implicit lazy val productGroupPromotionsJsonFormat: Format[ProductGroupPromotions] = Json.format[ProductGroupPromotions]
}

