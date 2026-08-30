package org.openapitools.server.model


/**
 * = ScheduleCommonDeltaValue =
 *
 * @param ageBucketMultipliers  for example: ''null''
 * @param appTypeMultipliers  for example: ''null''
 * @param audienceMultipliers  for example: ''null''
 * @param genderMultipliers  for example: ''null''
 * @param placementMultipliers  for example: ''null''
*/
final case class ScheduleCommonDeltaValue (
  ageBucketMultipliers: Option[ScheduleAgeBucketMultipliers] = None,
  appTypeMultipliers: Option[ScheduleAppTypeMultipliers] = None,
  audienceMultipliers: Option[ScheduleAudienceMultipliers] = None,
  genderMultipliers: Option[ScheduleBidOptionsGenderMultipliers] = None,
  placementMultipliers: Option[ScheduleBidOptionsPlacementMultipliers] = None
)

