package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PromotionsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PromotionsResponse(
  promotions: Option[List[PromotionArrayElement]]
)

object PromotionsResponse {
  implicit lazy val promotionsResponseJsonFormat: Format[PromotionsResponse] = Json.format[PromotionsResponse]
}

