
package org.openapitools.client.model


case class TopPinsAnalyticsResponseDateAvailability (
    _latestAvailableTimestamp: Option[Number],
    _isRealtime: Option[Boolean]
)
object TopPinsAnalyticsResponseDateAvailability {
    def toStringBody(var_latestAvailableTimestamp: Object, var_isRealtime: Object) =
        s"""
        | {
        | "latestAvailableTimestamp":$var_latestAvailableTimestamp,"isRealtime":$var_isRealtime
        | }
        """.stripMargin
}
