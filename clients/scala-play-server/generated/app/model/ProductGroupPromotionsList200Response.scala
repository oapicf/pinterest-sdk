package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for product_group_promotions_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ProductGroupPromotionsList200Response(
  items: List[ProductGroupPromotionResponseItem],
  bookmark: Option[String]
)

object ProductGroupPromotionsList200Response {
  implicit lazy val productGroupPromotionsList200ResponseJsonFormat: Format[ProductGroupPromotionsList200Response] = Json.format[ProductGroupPromotionsList200Response]
}

