goog.provide('API.Client.CampaignBidOptionsCreate');

/**
 * Object describing the campaign level bid multipliers.
 * @record
 */
API.Client.CampaignBidOptionsCreate = function() {}

/**
 * @type {!API.Client.AppTypeMultipliers}
 * @export
 */
API.Client.CampaignBidOptionsCreate.prototype.appTypeMultipliers;

/**
 * @type {!API.Client.CampaignAudienceMultipliers}
 * @export
 */
API.Client.CampaignBidOptionsCreate.prototype.audienceMultipliers;

/**
 * @type {!API.Client.PlacementMultipliers}
 * @export
 */
API.Client.CampaignBidOptionsCreate.prototype.placementMultipliers;

