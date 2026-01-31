package model

import play.api.libs.json._

/**
  * Individual trending topic within an interest category
  * @param description Description of the trending topic
  * @param percentGrowthMom Month-over-month growth percentage
  * @param pins Array of pin images related to this trend (up to 6)
  * @param relatedInterests List of related interest categories
  * @param relatedSearches List of related search terms
  * @param timeSeries Time series data showing trend values over time, with dates as keys and values as numeric
  * @param title Title of the trending topic
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TrendingTopic(
  description: String,
  percentGrowthMom: Int,
  pins: List[TrendingPin],
  relatedInterests: List[String],
  relatedSearches: List[String],
  timeSeries: Map[String, BigDecimal],
  title: String
)

object TrendingTopic {
  implicit lazy val trendingTopicJsonFormat: Format[TrendingTopic] = Json.format[TrendingTopic]
}

