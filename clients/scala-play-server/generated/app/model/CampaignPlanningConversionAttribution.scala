package model

import play.api.libs.json._

/**
  * Attribution windows for a conversion event.
  * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action.
  * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
  * @param viewWindowDays Number of days to use as the conversion attribution window for a view action.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CampaignPlanningConversionAttribution(
  clickWindowDays: Option[CampaignPlanningConversionAttributionWindowDays],
  engagementWindowDays: Option[CampaignPlanningConversionAttributionWindowDays],
  viewWindowDays: Option[CampaignPlanningConversionAttributionWindowDays]
)

object CampaignPlanningConversionAttribution {
  implicit lazy val campaignPlanningConversionAttributionJsonFormat: Format[CampaignPlanningConversionAttribution] = Json.format[CampaignPlanningConversionAttribution]
}

