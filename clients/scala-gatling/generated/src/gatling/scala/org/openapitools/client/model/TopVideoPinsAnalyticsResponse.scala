
package org.openapitools.client.model


case class TopVideoPinsAnalyticsResponse (
    _dateAvailability: Option[TopVideoPinsAnalyticsResponseDateAvailability],
    _pins: Option[List[TopVideoPinsAnalyticsResponsePinsItems]],
    _sortBy: Option[TopVideoPinsSortBy]
)
object TopVideoPinsAnalyticsResponse {
    def toStringBody(var_dateAvailability: Object, var_pins: Object, var_sortBy: Object) =
        s"""
        | {
        | "dateAvailability":$var_dateAvailability,"pins":$var_pins,"sortBy":$var_sortBy
        | }
        """.stripMargin
}
