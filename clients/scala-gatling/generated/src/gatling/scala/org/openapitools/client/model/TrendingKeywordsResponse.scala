
package org.openapitools.client.model


case class TrendingKeywordsResponse (
    /* The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend. */
    _trends: Option[List[TrendingKeywordsResponseTrendsInner]]
)
object TrendingKeywordsResponse {
    def toStringBody(var_trends: Object) =
        s"""
        | {
        | "trends":$var_trends
        | }
        """.stripMargin
}
