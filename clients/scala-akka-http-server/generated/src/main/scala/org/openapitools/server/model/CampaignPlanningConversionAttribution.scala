package org.openapitools.server.model


/**
 * Attribution windows for a conversion event.
 *
 * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. for example: ''null''
 * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. for example: ''null''
 * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. for example: ''null''
*/
final case class CampaignPlanningConversionAttribution (
  clickWindowDays: Option[CampaignPlanningConversionAttributionWindowDays] = None,
  engagementWindowDays: Option[CampaignPlanningConversionAttributionWindowDays] = None,
  viewWindowDays: Option[CampaignPlanningConversionAttributionWindowDays] = None
)

