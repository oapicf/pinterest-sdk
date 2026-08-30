goog.provide('API.Client.Schedule_delta_value');

/**
 * The value of the scheduled adjustment.
 * @record
 */
API.Client.ScheduleDeltaValue = function() {}

/**
 * @type {!API.Client.BidOptionsAgeBucketMultipliers}
 * @export
 */
API.Client.ScheduleDeltaValue.prototype.ageBucketMultipliers;

/**
 * @type {!API.Client.BidOptionsAppTypeMultipliers}
 * @export
 */
API.Client.ScheduleDeltaValue.prototype.appTypeMultipliers;

/**
 * @type {!Array<!API.Client.BidOptionsAudienceMultipliers>}
 * @export
 */
API.Client.ScheduleDeltaValue.prototype.audienceMultipliers;

/**
 * @type {!API.Client.BidOptionsGenderMultipliers}
 * @export
 */
API.Client.ScheduleDeltaValue.prototype.genderMultipliers;

/**
 * @type {!API.Client.BidOptionsPlacementMultipliers}
 * @export
 */
API.Client.ScheduleDeltaValue.prototype.placementMultipliers;

