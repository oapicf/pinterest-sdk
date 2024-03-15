package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for product_group_promotions_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ProductGroupPromotionsList200Response(
  items: List[ProductGroupPromotionResponseItem],
  bookmark: Option[String]
)

object ProductGroupPromotionsList200Response {
  implicit lazy val productGroupPromotionsList200ResponseJsonFormat: Format[ProductGroupPromotionsList200Response] = Json.format[ProductGroupPromotionsList200Response]
}

