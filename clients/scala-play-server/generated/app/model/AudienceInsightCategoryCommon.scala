package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceInsightCategoryCommon.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AudienceInsightCategoryCommon(
  id: Option[String],
  index: Option[BigDecimal],
  key: Option[String],
  name: Option[String],
  ratio: Option[BigDecimal]
)

object AudienceInsightCategoryCommon {
  implicit lazy val audienceInsightCategoryCommonJsonFormat: Format[AudienceInsightCategoryCommon] = Json.format[AudienceInsightCategoryCommon]
}

