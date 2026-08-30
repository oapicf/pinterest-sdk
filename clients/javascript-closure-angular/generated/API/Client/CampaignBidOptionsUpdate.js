goog.provide('API.Client.CampaignBidOptionsUpdate');

/**
 * Object describing an update to the campaign level bid multipliers.
 * @record
 */
API.Client.CampaignBidOptionsUpdate = function() {}

/**
 * Age bucket multipliers for bid adjustments.
 * @type {!API.Client.AgeBucketMultipliers}
 * @export
 */
API.Client.CampaignBidOptionsUpdate.prototype.ageBucketMultipliers;

/**
 * App type multipliers for bid adjustments.
 * @type {!API.Client.AppTypeMultipliers}
 * @export
 */
API.Client.CampaignBidOptionsUpdate.prototype.appTypeMultipliers;

/**
 * Audience multipliers for bid adjustments.
 * @type {!API.Client.CampaignAudienceMultipliers}
 * @export
 */
API.Client.CampaignBidOptionsUpdate.prototype.audienceMultipliers;

/**
 * The time window for frequency bid multipliers.
 * @type {!API.Client.FreqBidMultiplierTimeWindow}
 * @export
 */
API.Client.CampaignBidOptionsUpdate.prototype.freqBidMultiplierTimeWindow;

/**
 * Frequency multipliers for bid adjustments.
 * @type {!API.Client.FrequencyMultipliers}
 * @export
 */
API.Client.CampaignBidOptionsUpdate.prototype.frequencyMultipliers;

/**
 * Gender multipliers for bid adjustments.
 * @type {!API.Client.GenderMultipliers}
 * @export
 */
API.Client.CampaignBidOptionsUpdate.prototype.genderMultipliers;

/**
 * Placement multipliers for bid adjustments.
 * @type {!API.Client.PlacementMultipliers}
 * @export
 */
API.Client.CampaignBidOptionsUpdate.prototype.placementMultipliers;

/**
 * List of fields to update. Only the fields in the list will be updated.
 * @type {!Array<!API.Client.CampaignBidOptionsUpdateMaskItems>}
 * @export
 */
API.Client.CampaignBidOptionsUpdate.prototype.updateMask;

