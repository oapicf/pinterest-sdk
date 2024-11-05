package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeywordMetricsResponse.
  * @param keyword Keyword name, e.g., \"keyword\":\"fashion outfits\"
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class KeywordMetricsResponse(
  keyword: Option[String],
  metrics: Option[KeywordMetrics]
)

object KeywordMetricsResponse {
  implicit lazy val keywordMetricsResponseJsonFormat: Format[KeywordMetricsResponse] = Json.format[KeywordMetricsResponse]
}

