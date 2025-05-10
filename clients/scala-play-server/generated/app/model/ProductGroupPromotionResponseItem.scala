package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductGroupPromotionResponseItem.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class ProductGroupPromotionResponseItem(
  data: Option[ProductGroupPromotionResponseElement],
  exceptions: Option[List[Exception]]
)

object ProductGroupPromotionResponseItem {
  implicit lazy val productGroupPromotionResponseItemJsonFormat: Format[ProductGroupPromotionResponseItem] = Json.format[ProductGroupPromotionResponseItem]
}

