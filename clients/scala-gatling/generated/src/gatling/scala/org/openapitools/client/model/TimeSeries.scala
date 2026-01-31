
package org.openapitools.client.model

import java.time.LocalDate
import java.util.HashMap

case class TimeSeries (
    _date: Option[LocalDate]
)
object TimeSeries {
    def toStringBody(var_date: Object) =
        s"""
        | {
        | "date":$var_date
        | }
        """.stripMargin
}
