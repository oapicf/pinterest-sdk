package model

import play.api.libs.json._

/**
  * Keyword metrics JSON
  * @param keywordQueryVolume Keyword's search frequency. This value is based on keyword frequency in pepsi client response
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class KeywordMetrics(
  keywordQueryVolume: Option[String]
)

object KeywordMetrics {
  implicit lazy val keywordMetricsJsonFormat: Format[KeywordMetrics] = Json.format[KeywordMetrics]
}

