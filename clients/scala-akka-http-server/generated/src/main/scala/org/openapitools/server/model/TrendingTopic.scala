package org.openapitools.server.model


/**
 * Individual trending topic within an interest category
 *
 * @param description Description of the trending topic for example: ''null''
 * @param percentGrowthMom Month-over-month growth percentage for example: ''null''
 * @param pins Array of pin images related to this trend (up to 6) for example: ''null''
 * @param relatedInterests List of related interest categories for example: ''null''
 * @param relatedSearches List of related search terms for example: ''null''
 * @param timeSeries Time series data showing trend values over time, with dates as keys and values as numeric for example: ''null''
 * @param title Title of the trending topic for example: ''null''
*/
final case class TrendingTopic (
  description: String,
  percentGrowthMom: Int,
  pins: Seq[TrendingPin],
  relatedInterests: Seq[String],
  relatedSearches: Seq[String],
  timeSeries: Map[String, Double],
  title: String
)

