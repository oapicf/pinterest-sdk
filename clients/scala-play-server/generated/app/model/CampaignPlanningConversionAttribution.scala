package model

import play.api.libs.json._

/**
  * Attribution windows for a conversion event.
  * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action.
  * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
  * @param viewWindowDays Number of days to use as the conversion attribution window for a view action.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CampaignPlanningConversionAttribution(
  clickWindowDays: Option[CampaignPlanningConversionAttributionWindowDays],
  engagementWindowDays: Option[CampaignPlanningConversionAttributionWindowDays],
  viewWindowDays: Option[CampaignPlanningConversionAttributionWindowDays]
)

object CampaignPlanningConversionAttribution {
  implicit lazy val campaignPlanningConversionAttributionJsonFormat: Format[CampaignPlanningConversionAttribution] = Json.format[CampaignPlanningConversionAttribution]
}

