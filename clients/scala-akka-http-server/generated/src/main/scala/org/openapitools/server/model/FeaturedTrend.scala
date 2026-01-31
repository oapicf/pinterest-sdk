package org.openapitools.server.model


/**
 * Featured trending topics for a specific interest and market
 *
 * @param interest The main interest category for example: ''null''
 * @param market Market code (e.g., 'US', 'UK', etc.) for example: ''null''
 * @param trends List of trending topics within this interest category for example: ''null''
*/
final case class FeaturedTrend (
  interest: InterestsEnum,
  market: Option[ProductCategoryRegion] = None,
  trends: Option[Seq[TrendingTopic]] = None
)

