package org.openapitools.server.model


/**
 * Error encountered while estimating delivery for a campaign.
 *
 * @param code  for example: ''null''
 * @param message Human-readable error message. for example: ''null''
*/
final case class CampaignPlanningResponseError (
  code: Option[CampaignPlanningResponseErrorCode] = None,
  message: Option[String] = None
)

