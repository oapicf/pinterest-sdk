package org.openapitools.server.model


/**
 * Range audience size for an ad group.
 *
 * @param countLower Lower bound of the audience size estimate. for example: ''1000000''
 * @param countUpper Upper bound of the audience size estimate. for example: ''2000000''
*/
final case class CampaignPlanningAdGroupAudienceSize (
  countLower: Option[Int] = None,
  countUpper: Option[Int] = None
)

