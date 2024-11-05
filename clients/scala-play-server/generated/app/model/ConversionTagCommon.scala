package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionTagCommon.
  * @param adAccountId Ad account ID.
  * @param codeSnippet Tag code snippet.
  * @param id Tag ID.
  * @param lastFiredTimeMs Time for the last event fired.
  * @param name Conversion tag name.
  * @param version Version number.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ConversionTagCommon(
  adAccountId: Option[String],
  codeSnippet: Option[String],
  enhancedMatchStatus: Option[EnhancedMatchStatusType],
  id: Option[String],
  lastFiredTimeMs: Option[BigDecimal],
  name: Option[String],
  status: Option[EntityStatus],
  version: Option[String],
  configs: Option[ConversionTagConfigs]
)

object ConversionTagCommon {
  implicit lazy val conversionTagCommonJsonFormat: Format[ConversionTagCommon] = Json.format[ConversionTagCommon]
}

