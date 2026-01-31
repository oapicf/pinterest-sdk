package model

import play.api.libs.json._

/**
  * Determines the displayed promotion text along with what parameters (if any) are needed to complete the template. This list is not finalized, and will be updated as new types are supported.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PromotionType(
)

object PromotionType {
  implicit lazy val promotionTypeJsonFormat: Format[PromotionType] = Json.format[PromotionType]
}

