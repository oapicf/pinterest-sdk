
package org.openapitools.client.model

import java.time.LocalDate
import java.util.HashMap

case class AdAccountAnalyticsResponseInner (
    /* The ID of the advertiser that this metrics belongs to. */
    _AD_ACCOUNT_ID: String,
    /* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
    _DATE: Option[LocalDate]
)
object AdAccountAnalyticsResponseInner {
    def toStringBody(var_AD_ACCOUNT_ID: Object, var_DATE: Object) =
        s"""
        | {
        | "AD_ACCOUNT_ID":$var_AD_ACCOUNT_ID,"DATE":$var_DATE
        | }
        """.stripMargin
}
