
package org.openapitools.client.model


case class TopVideoPinsAnalyticsResponsePinsInner (
    /* The metric name and daily value for each requested metric */
    _metrics: Option[Map[String, Number]],
    _dataStatus: Option[Map[String, DataStatus]],
    /* The pin id */
    _pinId: Option[String]
)
object TopVideoPinsAnalyticsResponsePinsInner {
    def toStringBody(var_metrics: Object, var_dataStatus: Object, var_pinId: Object) =
        s"""
        | {
        | "metrics":$var_metrics,"dataStatus":$var_dataStatus,"pinId":$var_pinId
        | }
        """.stripMargin
}
