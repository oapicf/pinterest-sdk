goog.provide('API.Client.ScheduleBidMultipliers');

/**
 * The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.
 * @record
 */
API.Client.ScheduleBidMultipliers = function() {}

/**
 * @type {!API.Client.BidOptionsAgeBucketMultipliers}
 * @export
 */
API.Client.ScheduleBidMultipliers.prototype.ageBucketMultipliers;

/**
 * @type {!API.Client.BidOptionsAppTypeMultipliers}
 * @export
 */
API.Client.ScheduleBidMultipliers.prototype.appTypeMultipliers;

/**
 * @type {!Array<!API.Client.BidOptionsAudienceMultipliers>}
 * @export
 */
API.Client.ScheduleBidMultipliers.prototype.audienceMultipliers;

/**
 * @type {!API.Client.BidOptionsGenderMultipliers}
 * @export
 */
API.Client.ScheduleBidMultipliers.prototype.genderMultipliers;

/**
 * @type {!API.Client.BidOptionsPlacementMultipliers}
 * @export
 */
API.Client.ScheduleBidMultipliers.prototype.placementMultipliers;

