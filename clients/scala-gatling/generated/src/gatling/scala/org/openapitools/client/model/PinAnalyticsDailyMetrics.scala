
package org.openapitools.client.model


case class PinAnalyticsDailyMetrics (
    _dataStatus: Option[DataStatus],
    /* Metrics date (UTC): YYYY-MM-DD. */
    _date: Option[String],
    _metrics: Option[Map[String, Number]]
)
object PinAnalyticsDailyMetrics {
    def toStringBody(var_dataStatus: Object, var_date: Object, var_metrics: Object) =
        s"""
        | {
        | "dataStatus":$var_dataStatus,"date":$var_date,"metrics":$var_metrics
        | }
        """.stripMargin
}
