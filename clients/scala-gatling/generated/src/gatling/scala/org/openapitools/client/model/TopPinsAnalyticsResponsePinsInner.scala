
package org.openapitools.client.model


case class TopPinsAnalyticsResponsePinsInner (
    _dataStatus: Option[Map[String, DataStatus]],
    /* The metric name and daily value for each requested metric */
    _metrics: Option[Map[String, Number]],
    /* The pin id */
    _pinId: Option[String]
)
object TopPinsAnalyticsResponsePinsInner {
    def toStringBody(var_dataStatus: Object, var_metrics: Object, var_pinId: Object) =
        s"""
        | {
        | "dataStatus":$var_dataStatus,"metrics":$var_metrics,"pinId":$var_pinId
        | }
        """.stripMargin
}
