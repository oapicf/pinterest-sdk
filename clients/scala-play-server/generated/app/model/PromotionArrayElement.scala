package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PromotionArrayElement.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PromotionArrayElement(
  data: Option[Promotion],
  exception: Option[Exception]
)

object PromotionArrayElement {
  implicit lazy val promotionArrayElementJsonFormat: Format[PromotionArrayElement] = Json.format[PromotionArrayElement]
}

