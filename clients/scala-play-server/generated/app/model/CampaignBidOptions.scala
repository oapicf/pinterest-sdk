package model

import play.api.libs.json._

/**
  * Object describing the campaign level bid multipliers.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CampaignBidOptions(
  appTypeMultipliers: Option[AppTypeMultipliers],
  audienceMultipliers: Option[CampaignAudienceMultipliers],
  placementMultipliers: Option[PlacementMultipliers]
)

object CampaignBidOptions {
  implicit lazy val campaignBidOptionsJsonFormat: Format[CampaignBidOptions] = Json.format[CampaignBidOptions]
}

