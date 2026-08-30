package org.openapitools.server.model


/**
 * The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.
 *
 * @param ageBucketMultipliers  for example: ''null''
 * @param appTypeMultipliers  for example: ''null''
 * @param audienceMultipliers  for example: ''null''
 * @param genderMultipliers  for example: ''null''
 * @param placementMultipliers  for example: ''null''
*/
final case class ScheduleBidMultipliers (
  ageBucketMultipliers: Option[BidOptionsAgeBucketMultipliers] = None,
  appTypeMultipliers: Option[BidOptionsAppTypeMultipliers] = None,
  audienceMultipliers: Option[Seq[BidOptionsAudienceMultipliers]] = None,
  genderMultipliers: Option[BidOptionsGenderMultipliers] = None,
  placementMultipliers: Option[BidOptionsPlacementMultipliers] = None
)

