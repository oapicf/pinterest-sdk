
package org.openapitools.client.model


case class PinAnalyticsMetricsResponse (
    /* The lifetime metric name and value. */
    _lifetimeMetrics: Option[Map[String, Integer]],
    /* Array with the requested daily metric records */
    _dailyMetrics: Option[List[PinAnalyticsMetricsResponseDailyMetricsInner]],
    /* The metric name and value over the requested period for each requested metric */
    _summaryMetrics: Option[Map[String, Number]]
)
object PinAnalyticsMetricsResponse {
    def toStringBody(var_lifetimeMetrics: Object, var_dailyMetrics: Object, var_summaryMetrics: Object) =
        s"""
        | {
        | "lifetimeMetrics":$var_lifetimeMetrics,"dailyMetrics":$var_dailyMetrics,"summaryMetrics":$var_summaryMetrics
        | }
        """.stripMargin
}
