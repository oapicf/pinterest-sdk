
package org.openapitools.client.model


case class CampaignPlanningConversionAttribution (
    /* Number of days to use as the conversion attribution window for a pin click action. */
    _clickWindowDays: Option[CampaignPlanningConversionAttributionWindowDays],
    /* Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. */
    _engagementWindowDays: Option[CampaignPlanningConversionAttributionWindowDays],
    /* Number of days to use as the conversion attribution window for a view action. */
    _viewWindowDays: Option[CampaignPlanningConversionAttributionWindowDays]
)
object CampaignPlanningConversionAttribution {
    def toStringBody(var_clickWindowDays: Object, var_engagementWindowDays: Object, var_viewWindowDays: Object) =
        s"""
        | {
        | "clickWindowDays":$var_clickWindowDays,"engagementWindowDays":$var_engagementWindowDays,"viewWindowDays":$var_viewWindowDays
        | }
        """.stripMargin
}
