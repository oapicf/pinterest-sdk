package model

import play.api.libs.json._

/**
  * Specify if the promotion is applied at ad group or item level.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PromotionApplicationLevel(
)

object PromotionApplicationLevel {
  implicit lazy val promotionApplicationLevelJsonFormat: Format[PromotionApplicationLevel] = Json.format[PromotionApplicationLevel]
}

