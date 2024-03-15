package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceInsightCategoryCommon.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

