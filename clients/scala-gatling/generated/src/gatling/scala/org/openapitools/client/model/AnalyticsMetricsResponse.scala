
package org.openapitools.client.model


case class AnalyticsMetricsResponse (
    /* Array with the requested daily metric records */
    _dailyMetrics: Option[List[AnalyticsMetricsResponseDailyMetrics]],
    /* The metric name and value over the requested period for each requested metric */
    _summaryMetrics: Option[Map[String, Number]]
)
object AnalyticsMetricsResponse {
    def toStringBody(var_dailyMetrics: Object, var_summaryMetrics: Object) =
        s"""
        | {
        | "dailyMetrics":$var_dailyMetrics,"summaryMetrics":$var_summaryMetrics
        | }
        """.stripMargin
}
