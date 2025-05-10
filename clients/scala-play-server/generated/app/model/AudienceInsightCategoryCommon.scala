package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceInsightCategoryCommon.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
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

