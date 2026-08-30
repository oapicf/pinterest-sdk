package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for promotions_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PromotionsList200Response(
  bookmark: Option[String],
  items: List[Promotion]
)

object PromotionsList200Response {
  implicit lazy val promotionsList200ResponseJsonFormat: Format[PromotionsList200Response] = Json.format[PromotionsList200Response]
}

