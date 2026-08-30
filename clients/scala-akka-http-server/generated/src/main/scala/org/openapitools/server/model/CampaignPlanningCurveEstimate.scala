package org.openapitools.server.model


/**
 * @param estimationType Estimation type for campaign planning estimated curve for example: ''IMPRESSION''
 * @param points The estimation points that make up the estimated curve. for example: ''null''
*/
final case class CampaignPlanningCurveEstimate (
  estimationType: Option[CampaignPlanningEstimationType] = None,
  points: Option[Seq[CampaignPlanningPointEstimate]] = None
)

