package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceInsightCategoryCommon.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AudienceInsightCategoryCommon(
  key: Option[String],
  name: Option[String],
  ratio: Option[BigDecimal],
  index: Option[BigDecimal],
  id: Option[String]
)

object AudienceInsightCategoryCommon {
  implicit lazy val audienceInsightCategoryCommonJsonFormat: Format[AudienceInsightCategoryCommon] = Json.format[AudienceInsightCategoryCommon]
}

