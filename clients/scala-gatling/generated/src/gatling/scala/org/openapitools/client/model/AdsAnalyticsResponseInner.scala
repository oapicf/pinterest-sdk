
package org.openapitools.client.model

import java.time.LocalDate
import java.util.HashMap

case class AdsAnalyticsResponseInner (
    /* The ID of the ad that this metrics belongs to. */
    _AD_ID: String,
    /* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
    _DATE: Option[LocalDate]
)
object AdsAnalyticsResponseInner {
    def toStringBody(var_AD_ID: Object, var_DATE: Object) =
        s"""
        | {
        | "AD_ID":$var_AD_ID,"DATE":$var_DATE
        | }
        """.stripMargin
}
