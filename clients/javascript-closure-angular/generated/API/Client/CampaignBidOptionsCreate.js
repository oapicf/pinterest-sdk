goog.provide('API.Client.CampaignBidOptionsCreate');

/**
 * Object describing the campaign level bid multipliers for create operations.
 * @record
 */
API.Client.CampaignBidOptionsCreate = function() {}

/**
 * Age bucket multipliers for bid adjustments.
 * @type {!API.Client.AgeBucketMultipliers}
 * @export
 */
API.Client.CampaignBidOptionsCreate.prototype.ageBucketMultipliers;

/**
 * App type multipliers for bid adjustments.
 * @type {!API.Client.AppTypeMultipliers}
 * @export
 */
API.Client.CampaignBidOptionsCreate.prototype.appTypeMultipliers;

/**
 * Audience multipliers for bid adjustments.
 * @type {!API.Client.CampaignAudienceMultipliers}
 * @export
 */
API.Client.CampaignBidOptionsCreate.prototype.audienceMultipliers;

/**
 * The time window for frequency bid multipliers.
 * @type {!API.Client.FreqBidMultiplierTimeWindow}
 * @export
 */
API.Client.CampaignBidOptionsCreate.prototype.freqBidMultiplierTimeWindow;

/**
 * Frequency multipliers for bid adjustments.
 * @type {!API.Client.FrequencyMultipliers}
 * @export
 */
API.Client.CampaignBidOptionsCreate.prototype.frequencyMultipliers;

/**
 * Gender multipliers for bid adjustments.
 * @type {!API.Client.GenderMultipliers}
 * @export
 */
API.Client.CampaignBidOptionsCreate.prototype.genderMultipliers;

/**
 * Placement multipliers for bid adjustments.
 * @type {!API.Client.PlacementMultipliers}
 * @export
 */
API.Client.CampaignBidOptionsCreate.prototype.placementMultipliers;

