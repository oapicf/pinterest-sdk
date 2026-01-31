package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TrendingKeywordsResponse.
  * @param trends The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TrendingKeywordsResponse(
  trends: Option[List[TrendingKeywordsResponseTrendsInner]]
)

object TrendingKeywordsResponse {
  implicit lazy val trendingKeywordsResponseJsonFormat: Format[TrendingKeywordsResponse] = Json.format[TrendingKeywordsResponse]
}

