package model

import play.api.libs.json._

/**
  * Keyword metrics JSON
  * @param keywordQueryVolume Keyword's search frequency. This value is based on keyword frequency in pepsi client response
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class KeywordMetrics(
  keywordQueryVolume: Option[String]
)

object KeywordMetrics {
  implicit lazy val keywordMetricsJsonFormat: Format[KeywordMetrics] = Json.format[KeywordMetrics]
}

