package model

import play.api.libs.json._

/**
  * Determines the displayed promotion text along with what parameters (if any) are needed to complete the template.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PromotionType(
)

object PromotionType {
  implicit lazy val promotionTypeJsonFormat: Format[PromotionType] = Json.format[PromotionType]
}

