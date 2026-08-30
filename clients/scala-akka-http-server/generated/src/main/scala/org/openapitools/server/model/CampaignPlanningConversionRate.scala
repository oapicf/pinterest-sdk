package org.openapitools.server.model


/**
 * Conversion rate estimate for a specific conversion event and attribution window combination.
 *
 * @param attributionWindows  for example: ''null''
 * @param conversionEvent  for example: ''null''
 * @param conversionRate Conversion rate estimate. Used to translate impressions into conversions for oCPM ads. for example: ''2.32600002288818''
*/
final case class CampaignPlanningConversionRate (
  attributionWindows: CampaignPlanningConversionAttribution,
  conversionEvent: CampaignPlanningConversionEvent,
  conversionRate: Float
)

