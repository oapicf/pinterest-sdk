
package org.openapitools.client.model


case class KeywordMetricsResponse (
    /* Keyword name, e.g., \"keyword\":\"fashion outfits\" */
    _keyword: Option[String],
    _metrics: Option[KeywordMetrics]
)
object KeywordMetricsResponse {
    def toStringBody(var_keyword: Object, var_metrics: Object) =
        s"""
        | {
        | "keyword":$var_keyword,"metrics":$var_metrics
        | }
        """.stripMargin
}
