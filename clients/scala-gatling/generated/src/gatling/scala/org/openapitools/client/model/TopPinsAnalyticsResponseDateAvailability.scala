
package org.openapitools.client.model


case class TopPinsAnalyticsResponseDateAvailability (
    _isRealtime: Option[Boolean],
    _latestAvailableTimestamp: Option[Number]
)
object TopPinsAnalyticsResponseDateAvailability {
    def toStringBody(var_isRealtime: Object, var_latestAvailableTimestamp: Object) =
        s"""
        | {
        | "isRealtime":$var_isRealtime,"latestAvailableTimestamp":$var_latestAvailableTimestamp
        | }
        """.stripMargin
}
