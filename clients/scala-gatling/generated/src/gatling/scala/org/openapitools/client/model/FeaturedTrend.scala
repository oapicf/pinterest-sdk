
package org.openapitools.client.model


case class FeaturedTrend (
    /* The main interest category */
    _interest: InterestsEnum,
    /* Market code (e.g., 'US', 'UK', etc.) */
    _market: Option[ProductCategoryRegion],
    /* List of trending topics within this interest category */
    _trends: Option[List[TrendingTopic]]
)
object FeaturedTrend {
    def toStringBody(var_interest: Object, var_market: Object, var_trends: Object) =
        s"""
        | {
        | "interest":$var_interest,"market":$var_market,"trends":$var_trends
        | }
        """.stripMargin
}
