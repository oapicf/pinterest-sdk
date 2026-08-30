
package org.openapitools.client.model


case class TopPinsAnalyticsResponsePinsItems (
    _dataStatus: Option[Map[String, DataStatus]],
    _metrics: Option[Map[String, Number]],
    /* The pin id */
    _pinId: Option[String]
)
object TopPinsAnalyticsResponsePinsItems {
    def toStringBody(var_dataStatus: Object, var_metrics: Object, var_pinId: Object) =
        s"""
        | {
        | "dataStatus":$var_dataStatus,"metrics":$var_metrics,"pinId":$var_pinId
        | }
        """.stripMargin
}
