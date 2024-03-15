
package org.openapitools.client.model


case class TopVideoPinsAnalyticsResponse (
    _dateAvailability: Option[TopPinsAnalyticsResponseDateAvailability],
    _pins: Option[List[TopVideoPinsAnalyticsResponsePinsInner]],
    _sortBy: Option[String]
)
object TopVideoPinsAnalyticsResponse {
    def toStringBody(var_dateAvailability: Object, var_pins: Object, var_sortBy: Object) =
        s"""
        | {
        | "dateAvailability":$var_dateAvailability,"pins":$var_pins,"sortBy":$var_sortBy
        | }
        """.stripMargin
}
