package org.openapitools.server.model


/**
 * Object describing the campaign level bid multipliers.
 *
 * @param appTypeMultipliers  for example: ''null''
 * @param audienceMultipliers  for example: ''null''
 * @param placementMultipliers  for example: ''null''
*/
final case class CampaignBidOptions (
  appTypeMultipliers: Option[AppTypeMultipliers] = None,
  audienceMultipliers: Option[CampaignAudienceMultipliers] = None,
  placementMultipliers: Option[PlacementMultipliers] = None
)

