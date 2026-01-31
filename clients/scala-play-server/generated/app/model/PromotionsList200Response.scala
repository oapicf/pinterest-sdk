package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for promotions_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PromotionsList200Response(
  bookmark: Option[String],
  items: List[PromotionResponse]
)

object PromotionsList200Response {
  implicit lazy val promotionsList200ResponseJsonFormat: Format[PromotionsList200Response] = Json.format[PromotionsList200Response]
}

