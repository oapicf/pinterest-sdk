
package org.openapitools.client.model

import java.time.LocalDate
import java.util.HashMap

case class CampaignsAnalyticsResponseInner (
    /* The ID of the campaing that this metrics belongs to. */
    _CAMPAIGN_ID: String,
    /* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
    _DATE: Option[LocalDate]
)
object CampaignsAnalyticsResponseInner {
    def toStringBody(var_CAMPAIGN_ID: Object, var_DATE: Object) =
        s"""
        | {
        | "CAMPAIGN_ID":$var_CAMPAIGN_ID,"DATE":$var_DATE
        | }
        """.stripMargin
}
