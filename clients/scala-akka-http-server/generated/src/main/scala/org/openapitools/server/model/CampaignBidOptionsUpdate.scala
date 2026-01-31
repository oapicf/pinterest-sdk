package org.openapitools.server.model


/**
 * Object describing an update to the campaign level bid multipliers.
 *
 * @param appTypeMultipliers  for example: ''null''
 * @param audienceMultipliers  for example: ''null''
 * @param placementMultipliers  for example: ''null''
 * @param updateMask List of fields to update, only the fields in the list will be updated. for example: ''null''
*/
final case class CampaignBidOptionsUpdate (
  appTypeMultipliers: Option[AppTypeMultipliers] = None,
  audienceMultipliers: Option[CampaignAudienceMultipliers] = None,
  placementMultipliers: Option[PlacementMultipliers] = None,
  updateMask: Seq[String]
)

