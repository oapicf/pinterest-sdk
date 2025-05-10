package model

import play.api.libs.json._

/**
  * Keyword metrics JSON
  * @param avgCpcInMicroCurrency Average cost per click
  * @param keywordQueryVolume Keyword's search frequency. This value is based on keyword frequency in pepsi client response
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class KeywordMetrics(
  avgCpcInMicroCurrency: Option[BigDecimal],
  keywordQueryVolume: Option[String]
)

object KeywordMetrics {
  implicit lazy val keywordMetricsJsonFormat: Format[KeywordMetrics] = Json.format[KeywordMetrics]
}

