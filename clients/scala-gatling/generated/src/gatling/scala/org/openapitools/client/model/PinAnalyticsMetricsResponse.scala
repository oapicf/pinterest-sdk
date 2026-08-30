
package org.openapitools.client.model


case class PinAnalyticsMetricsResponse (
    /* Array with the requested daily metric records */
    _dailyMetrics: Option[List[PinAnalyticsDailyMetrics]],
    /* The lifetime metric name and value. */
    _lifetimeMetrics: Option[Map[String, Integer]],
    /* The metric name and value over the requested period for each requested metric */
    _summaryMetrics: Option[Map[String, Number]]
)
object PinAnalyticsMetricsResponse {
    def toStringBody(var_dailyMetrics: Object, var_lifetimeMetrics: Object, var_summaryMetrics: Object) =
        s"""
        | {
        | "dailyMetrics":$var_dailyMetrics,"lifetimeMetrics":$var_lifetimeMetrics,"summaryMetrics":$var_summaryMetrics
        | }
        """.stripMargin
}
