
package org.openapitools.client.model

import java.time.LocalDate

case class AdPinAnalytics (
    /* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
    _DATE: Option[LocalDate],
    /* The ID of the pin that the metric belongs to. */
    _PIN_ID: String
)
object AdPinAnalytics {
    def toStringBody(var_DATE: Object, var_PIN_ID: Object) =
        s"""
        | {
        | "DATE":$var_DATE,"PIN_ID":$var_PIN_ID
        | }
        """.stripMargin
}
