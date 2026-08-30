package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TrendingKeywordsResponse.
  * @param trends The top trending keywords for the specified trend type in the requested region. Results are ordered, with the first element in the array representing the #1 top trend.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TrendingKeywordsResponse(
  trends: Option[List[TrendingKeyword]]
)

object TrendingKeywordsResponse {
  implicit lazy val trendingKeywordsResponseJsonFormat: Format[TrendingKeywordsResponse] = Json.format[TrendingKeywordsResponse]
}

