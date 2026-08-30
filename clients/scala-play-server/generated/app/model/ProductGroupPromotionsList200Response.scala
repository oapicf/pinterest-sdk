package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for product_group_promotions_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ProductGroupPromotionsList200Response(
  bookmark: Option[String],
  items: List[ProductGroupPromotion]
)

object ProductGroupPromotionsList200Response {
  implicit lazy val productGroupPromotionsList200ResponseJsonFormat: Format[ProductGroupPromotionsList200Response] = Json.format[ProductGroupPromotionsList200Response]
}

