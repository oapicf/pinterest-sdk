
package org.openapitools.client.model

import java.time.LocalDate
import java.util.HashMap

case class PredictedTimeSeries (
    _date: Option[LocalDate]
)
object PredictedTimeSeries {
    def toStringBody(var_date: Object) =
        s"""
        | {
        | "date":$var_date
        | }
        """.stripMargin
}
