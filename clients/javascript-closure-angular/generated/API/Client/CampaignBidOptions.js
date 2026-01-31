goog.provide('API.Client.CampaignBidOptions');

/**
 * Object describing the campaign level bid multipliers.
 * @record
 */
API.Client.CampaignBidOptions = function() {}

/**
 * @type {!API.Client.AppTypeMultipliers}
 * @export
 */
API.Client.CampaignBidOptions.prototype.appTypeMultipliers;

/**
 * @type {!API.Client.CampaignAudienceMultipliers}
 * @export
 */
API.Client.CampaignBidOptions.prototype.audienceMultipliers;

/**
 * @type {!API.Client.PlacementMultipliers}
 * @export
 */
API.Client.CampaignBidOptions.prototype.placementMultipliers;

