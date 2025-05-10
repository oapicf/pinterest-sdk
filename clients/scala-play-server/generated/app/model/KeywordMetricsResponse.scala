package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeywordMetricsResponse.
  * @param keyword Keyword name, e.g., \"keyword\":\"fashion outfits\"
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class KeywordMetricsResponse(
  keyword: Option[String],
  metrics: Option[KeywordMetrics]
)

object KeywordMetricsResponse {
  implicit lazy val keywordMetricsResponseJsonFormat: Format[KeywordMetricsResponse] = Json.format[KeywordMetricsResponse]
}

