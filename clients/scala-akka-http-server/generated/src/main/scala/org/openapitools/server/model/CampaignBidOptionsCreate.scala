package org.openapitools.server.model


/**
 * Object describing the campaign level bid multipliers for create operations.
 *
 * @param ageBucketMultipliers Age bucket multipliers for bid adjustments. for example: ''null''
 * @param appTypeMultipliers App type multipliers for bid adjustments. for example: ''null''
 * @param audienceMultipliers Audience multipliers for bid adjustments. for example: ''null''
 * @param freqBidMultiplierTimeWindow The time window for frequency bid multipliers. for example: ''null''
 * @param frequencyMultipliers Frequency multipliers for bid adjustments. for example: ''null''
 * @param genderMultipliers Gender multipliers for bid adjustments. for example: ''null''
 * @param placementMultipliers Placement multipliers for bid adjustments. for example: ''null''
*/
final case class CampaignBidOptionsCreate (
  ageBucketMultipliers: Option[AgeBucketMultipliers] = None,
  appTypeMultipliers: Option[AppTypeMultipliers] = None,
  audienceMultipliers: Option[CampaignAudienceMultipliers] = None,
  freqBidMultiplierTimeWindow: Option[FreqBidMultiplierTimeWindow] = None,
  frequencyMultipliers: Option[FrequencyMultipliers] = None,
  genderMultipliers: Option[GenderMultipliers] = None,
  placementMultipliers: Option[PlacementMultipliers] = None
)

