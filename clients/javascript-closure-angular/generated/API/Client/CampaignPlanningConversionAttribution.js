goog.provide('API.Client.CampaignPlanningConversionAttribution');

/**
 * Attribution windows for a conversion event.
 * @record
 */
API.Client.CampaignPlanningConversionAttribution = function() {}

/**
 * Number of days to use as the conversion attribution window for a pin click action.
 * @type {!API.Client.CampaignPlanningConversionAttributionWindowDays}
 * @export
 */
API.Client.CampaignPlanningConversionAttribution.prototype.clickWindowDays;

/**
 * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
 * @type {!API.Client.CampaignPlanningConversionAttributionWindowDays}
 * @export
 */
API.Client.CampaignPlanningConversionAttribution.prototype.engagementWindowDays;

/**
 * Number of days to use as the conversion attribution window for a view action.
 * @type {!API.Client.CampaignPlanningConversionAttributionWindowDays}
 * @export
 */
API.Client.CampaignPlanningConversionAttribution.prototype.viewWindowDays;

