
package org.openapitools.client.model

import java.time.LocalDate
import java.util.HashMap

case class AdGroupsAnalyticsResponseInner (
    /* The ID of the ad group that this metrics belongs to. */
    _AD_GROUP_ID: String,
    /* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
    _DATE: Option[LocalDate]
)
object AdGroupsAnalyticsResponseInner {
    def toStringBody(var_AD_GROUP_ID: Object, var_DATE: Object) =
        s"""
        | {
        | "AD_GROUP_ID":$var_AD_GROUP_ID,"DATE":$var_DATE
        | }
        """.stripMargin
}
