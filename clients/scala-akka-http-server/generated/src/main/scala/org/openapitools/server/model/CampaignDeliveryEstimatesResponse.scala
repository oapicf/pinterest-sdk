package org.openapitools.server.model


/**
 * Delivery estimates response for a campaign.
 *
 * @param curves Estimated curves. Each curve will pertain to a single estimation type. for example: ''null''
 * @param derivedMetrics  for example: ''null''
 * @param maxPotentialSpend Maximum potential spend estimate. for example: ''50000000''
*/
final case class CampaignDeliveryEstimatesResponse (
  curves: Option[Seq[CampaignPlanningCurveEstimate]] = None,
  derivedMetrics: Option[CampaignDeliveryEstimatesDerivedMetrics] = None,
  maxPotentialSpend: Option[Int] = None
)

