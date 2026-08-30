
package org.openapitools.client.model

import java.time.LocalDate

case class AdGroupsAnalyticsMetrics (
    /* The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true. */
    _AD_GROUP_ID: Option[String],
    /* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
    _DATE: Option[LocalDate]
)
object AdGroupsAnalyticsMetrics {
    def toStringBody(var_AD_GROUP_ID: Object, var_DATE: Object) =
        s"""
        | {
        | "AD_GROUP_ID":$var_AD_GROUP_ID,"DATE":$var_DATE
        | }
        """.stripMargin
}
