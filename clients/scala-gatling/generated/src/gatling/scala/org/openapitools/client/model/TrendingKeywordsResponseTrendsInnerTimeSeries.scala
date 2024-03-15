
package org.openapitools.client.model

import java.time.LocalDate
import java.util.HashMap

case class TrendingKeywordsResponseTrendsInnerTimeSeries (
    _date: Option[LocalDate]
)
object TrendingKeywordsResponseTrendsInnerTimeSeries {
    def toStringBody(var_date: Object) =
        s"""
        | {
        | "date":$var_date
        | }
        """.stripMargin
}
