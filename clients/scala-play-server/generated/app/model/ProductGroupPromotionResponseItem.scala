package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductGroupPromotionResponseItem.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ProductGroupPromotionResponseItem(
  data: Option[ProductGroupPromotion],
  exceptions: Option[List[Exception]]
)

object ProductGroupPromotionResponseItem {
  implicit lazy val productGroupPromotionResponseItemJsonFormat: Format[ProductGroupPromotionResponseItem] = Json.format[ProductGroupPromotionResponseItem]
}

