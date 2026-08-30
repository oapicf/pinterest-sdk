package org.openapitools.server.model


/**
 * Delivery estimate result for a single campaign within a bulk request.
 *
 * @param adgroupAudienceSizes Range audience sizes for each ad group, in the same order as the ad groups in the request. for example: ''null''
 * @param conversionRate Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. for example: ''2.32600002288818''
 * @param conversionRates Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. for example: ''null''
 * @param curves Estimated curves. Each curve will pertain to a single estimation type. for example: ''null''
 * @param derivedMetrics  for example: ''null''
 * @param errors Errors encountered during estimation for this campaign. for example: ''null''
 * @param estimateId UUID used to track delivery estimates when they are generated as part of a saved campaign. for example: ''db1b0d75-4386-4db3-8a85-e5725d4dff51''
 * @param maxPotentialSpend Maximum potential spend estimate. for example: ''50000000''
*/
final case class BulkCampaignDeliveryEstimatesItem (
  adgroupAudienceSizes: Option[Seq[CampaignPlanningAdGroupAudienceSize]] = None,
  conversionRate: Option[Float] = None,
  conversionRates: Option[Seq[CampaignPlanningConversionRate]] = None,
  curves: Option[Seq[CampaignPlanningCurveEstimate]] = None,
  derivedMetrics: Option[CampaignDeliveryEstimatesDerivedMetrics] = None,
  errors: Option[Seq[CampaignPlanningResponseError]] = None,
  estimateId: Option[String] = None,
  maxPotentialSpend: Option[Int] = None
)

