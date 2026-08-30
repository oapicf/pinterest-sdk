package org.openapitools.server.model


/**
 * The value of the scheduled adjustment.
 *
 * @param ageBucketMultipliers  for example: ''null''
 * @param appTypeMultipliers  for example: ''null''
 * @param audienceMultipliers  for example: ''null''
 * @param genderMultipliers  for example: ''null''
 * @param placementMultipliers  for example: ''null''
*/
final case class ScheduleDeltaValue (
  ageBucketMultipliers: Option[BidOptionsAgeBucketMultipliers] = None,
  appTypeMultipliers: Option[BidOptionsAppTypeMultipliers] = None,
  audienceMultipliers: Option[Seq[BidOptionsAudienceMultipliers]] = None,
  genderMultipliers: Option[BidOptionsGenderMultipliers] = None,
  placementMultipliers: Option[BidOptionsPlacementMultipliers] = None
)

