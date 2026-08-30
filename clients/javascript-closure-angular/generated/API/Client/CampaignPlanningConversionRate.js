goog.provide('API.Client.CampaignPlanningConversionRate');

/**
 * Conversion rate estimate for a specific conversion event and attribution window combination.
 * @record
 */
API.Client.CampaignPlanningConversionRate = function() {}

/**
 * @type {!API.Client.CampaignPlanningConversionAttribution}
 * @export
 */
API.Client.CampaignPlanningConversionRate.prototype.attributionWindows;

/**
 * @type {!API.Client.CampaignPlanningConversionEvent}
 * @export
 */
API.Client.CampaignPlanningConversionRate.prototype.conversionEvent;

/**
 * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
 * @type {!number}
 * @export
 */
API.Client.CampaignPlanningConversionRate.prototype.conversionRate;

