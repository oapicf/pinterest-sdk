package model

import play.api.libs.json._

/**
  * Featured trending topics for a specific interest and market
  * @param interest The main interest category
  * @param market Market code (e.g., 'US', 'UK', etc.)
  * @param trends List of trending topics within this interest category
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class FeaturedTrend(
  interest: InterestsEnum,
  market: Option[ProductCategoryRegion],
  trends: Option[List[TrendingTopic]]
)

object FeaturedTrend {
  implicit lazy val featuredTrendJsonFormat: Format[FeaturedTrend] = Json.format[FeaturedTrend]
}

