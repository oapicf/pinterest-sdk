package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for product_group_promotions_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ProductGroupPromotionsList200Response(
  items: List[ProductGroupPromotionResponseItem],
  bookmark: Option[String]
)

object ProductGroupPromotionsList200Response {
  implicit lazy val productGroupPromotionsList200ResponseJsonFormat: Format[ProductGroupPromotionsList200Response] = Json.format[ProductGroupPromotionsList200Response]
}

