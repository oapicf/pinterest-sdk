
package org.openapitools.client.model


case class AnalyticsDailyMetrics (
    _dataStatus: Option[DataStatus],
    /* Metrics date (UTC): YYYY-MM-DD. */
    _date: Option[String],
    /* The metric name and daily value for each requested metric */
    _metrics: Option[Map[String, Number]]
)
object AnalyticsDailyMetrics {
    def toStringBody(var_dataStatus: Object, var_date: Object, var_metrics: Object) =
        s"""
        | {
        | "dataStatus":$var_dataStatus,"date":$var_date,"metrics":$var_metrics
        | }
        """.stripMargin
}
