package model

import play.api.libs.json._

/**
  * Object describing the campaign level bid multipliers for create operations.
  * @param ageBucketMultipliers Age bucket multipliers for bid adjustments.
  * @param appTypeMultipliers App type multipliers for bid adjustments.
  * @param audienceMultipliers Audience multipliers for bid adjustments.
  * @param freqBidMultiplierTimeWindow The time window for frequency bid multipliers.
  * @param frequencyMultipliers Frequency multipliers for bid adjustments.
  * @param genderMultipliers Gender multipliers for bid adjustments.
  * @param placementMultipliers Placement multipliers for bid adjustments.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignBidOptionsCreate(
  ageBucketMultipliers: Option[AgeBucketMultipliers],
  appTypeMultipliers: Option[AppTypeMultipliers],
  audienceMultipliers: Option[CampaignAudienceMultipliers],
  freqBidMultiplierTimeWindow: Option[FreqBidMultiplierTimeWindow],
  frequencyMultipliers: Option[FrequencyMultipliers],
  genderMultipliers: Option[GenderMultipliers],
  placementMultipliers: Option[PlacementMultipliers]
)

object CampaignBidOptionsCreate {
  implicit lazy val campaignBidOptionsCreateJsonFormat: Format[CampaignBidOptionsCreate] = Json.format[CampaignBidOptionsCreate]
}

