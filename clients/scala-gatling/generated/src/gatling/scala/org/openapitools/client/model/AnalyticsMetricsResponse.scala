
package org.openapitools.client.model


case class AnalyticsMetricsResponse (
    /* The metric name and value over the requested period for each requested metric */
    _summaryMetrics: Option[Map[String, Number]],
    /* Array with the requested daily metric records */
    _dailyMetrics: Option[List[AnalyticsDailyMetrics]]
)
object AnalyticsMetricsResponse {
    def toStringBody(var_summaryMetrics: Object, var_dailyMetrics: Object) =
        s"""
        | {
        | "summaryMetrics":$var_summaryMetrics,"dailyMetrics":$var_dailyMetrics
        | }
        """.stripMargin
}
