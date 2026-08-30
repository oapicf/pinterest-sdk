package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionTagCommon.
  * @param codeSnippet Tag code snippet.
  * @param enhancedMatchStatus The enhanced match status of the tag
  * @param id Tag ID.
  * @param lastFiredTimeMs Time for the last event fired.
  * @param name Conversion tag name.
  * @param version Version number.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ConversionTagCommon(
  codeSnippet: Option[String],
  configs: Option[ConversionTagConfigs],
  enhancedMatchStatus: Option[EnhancedMatchStatusType],
  id: Option[String],
  lastFiredTimeMs: Option[BigDecimal],
  name: String,
  version: Option[String]
)

object ConversionTagCommon {
  implicit lazy val conversionTagCommonJsonFormat: Format[ConversionTagCommon] = Json.format[ConversionTagCommon]
}

