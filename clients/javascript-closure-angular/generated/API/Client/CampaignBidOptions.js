goog.provide('API.Client.CampaignBidOptions');

/**
 * Object describing the campaign level bid multipliers.
 * @record
 */
API.Client.CampaignBidOptions = function() {}

/**
 * Age bucket multipliers for bid adjustments.
 * @type {!API.Client.AgeBucketMultipliers}
 * @export
 */
API.Client.CampaignBidOptions.prototype.ageBucketMultipliers;

/**
 * App type multipliers for bid adjustments.
 * @type {!API.Client.AppTypeMultipliers}
 * @export
 */
API.Client.CampaignBidOptions.prototype.appTypeMultipliers;

/**
 * Audience multipliers for bid adjustments.
 * @type {!API.Client.CampaignAudienceMultipliers}
 * @export
 */
API.Client.CampaignBidOptions.prototype.audienceMultipliers;

/**
 * The time window for frequency bid multipliers.
 * @type {!API.Client.FreqBidMultiplierTimeWindow}
 * @export
 */
API.Client.CampaignBidOptions.prototype.freqBidMultiplierTimeWindow;

/**
 * Frequency multipliers for bid adjustments.
 * @type {!API.Client.FrequencyMultipliers}
 * @export
 */
API.Client.CampaignBidOptions.prototype.frequencyMultipliers;

/**
 * Gender multipliers for bid adjustments.
 * @type {!API.Client.GenderMultipliers}
 * @export
 */
API.Client.CampaignBidOptions.prototype.genderMultipliers;

/**
 * Placement multipliers for bid adjustments.
 * @type {!API.Client.PlacementMultipliers}
 * @export
 */
API.Client.CampaignBidOptions.prototype.placementMultipliers;

