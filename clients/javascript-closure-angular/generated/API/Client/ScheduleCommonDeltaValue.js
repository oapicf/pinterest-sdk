goog.provide('API.Client.ScheduleCommonDeltaValue');

/**
 * @record
 */
API.Client.ScheduleCommonDeltaValue = function() {}

/**
 * @type {!API.Client.ScheduleAgeBucketMultipliers}
 * @export
 */
API.Client.ScheduleCommonDeltaValue.prototype.ageBucketMultipliers;

/**
 * @type {!API.Client.ScheduleAppTypeMultipliers}
 * @export
 */
API.Client.ScheduleCommonDeltaValue.prototype.appTypeMultipliers;

/**
 * @type {!API.Client.ScheduleAudienceMultipliers}
 * @export
 */
API.Client.ScheduleCommonDeltaValue.prototype.audienceMultipliers;

/**
 * @type {!API.Client.ScheduleBidOptions_gender_multipliers}
 * @export
 */
API.Client.ScheduleCommonDeltaValue.prototype.genderMultipliers;

/**
 * @type {!API.Client.ScheduleBidOptions_placement_multipliers}
 * @export
 */
API.Client.ScheduleCommonDeltaValue.prototype.placementMultipliers;

