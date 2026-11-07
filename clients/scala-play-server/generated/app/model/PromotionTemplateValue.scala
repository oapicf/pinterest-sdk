package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PromotionTemplateValue.
  * @param amount Numeric value.
  * @param customText Custom text.
  * @param percent Percent value.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PromotionTemplateValue(
  amount: Option[BigDecimal],
  currencyCode: Option[Currency],
  customText: Option[String],
  percent: Option[BigDecimal]
)

object PromotionTemplateValue {
  implicit lazy val promotionTemplateValueJsonFormat: Format[PromotionTemplateValue] = Json.format[PromotionTemplateValue]
}

