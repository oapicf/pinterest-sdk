goog.provide('API.Client.CampaignPlanningResponseError');

/**
 * Error encountered while estimating delivery for a campaign.
 * @record
 */
API.Client.CampaignPlanningResponseError = function() {}

/**
 * @type {!API.Client.CampaignPlanningResponseErrorCode}
 * @export
 */
API.Client.CampaignPlanningResponseError.prototype.code;

/**
 * Human-readable error message.
 * @type {!string}
 * @export
 */
API.Client.CampaignPlanningResponseError.prototype.message;

