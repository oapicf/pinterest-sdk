
package org.openapitools.client.model


case class TopPinsAnalyticsResponse (
    _dateAvailability: Option[TopPinsAnalyticsResponseDateAvailability],
    _pins: Option[List[TopPinsAnalyticsResponsePinsInner]],
    _sortBy: Option[String]
)
object TopPinsAnalyticsResponse {
    def toStringBody(var_dateAvailability: Object, var_pins: Object, var_sortBy: Object) =
        s"""
        | {
        | "dateAvailability":$var_dateAvailability,"pins":$var_pins,"sortBy":$var_sortBy
        | }
        """.stripMargin
}
