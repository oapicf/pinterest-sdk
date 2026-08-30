
package org.openapitools.client.model


case class TopVideoPinsAnalyticsResponseDateAvailability (
    _isRealtime: Option[Boolean],
    _latestAvailableTimestamp: Option[Number]
)
object TopVideoPinsAnalyticsResponseDateAvailability {
    def toStringBody(var_isRealtime: Object, var_latestAvailableTimestamp: Object) =
        s"""
        | {
        | "isRealtime":$var_isRealtime,"latestAvailableTimestamp":$var_latestAvailableTimestamp
        | }
        """.stripMargin
}
