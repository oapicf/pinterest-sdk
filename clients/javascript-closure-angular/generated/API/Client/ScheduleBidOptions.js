goog.provide('API.Client.ScheduleBidOptions');

/**
 * Object describing the schedule level bid level changes.
 * @record
 */
API.Client.ScheduleBidOptions = function() {}

/**
 * @type {!API.Client.ScheduleAgeBucketMultipliers}
 * @export
 */
API.Client.ScheduleBidOptions.prototype.ageBucketMultipliers;

/**
 * @type {!API.Client.ScheduleAppTypeMultipliers}
 * @export
 */
API.Client.ScheduleBidOptions.prototype.appTypeMultipliers;

/**
 * @type {!API.Client.ScheduleAudienceMultipliers}
 * @export
 */
API.Client.ScheduleBidOptions.prototype.audienceMultipliers;

/**
 * @type {!API.Client.ScheduleBidOptions_gender_multipliers}
 * @export
 */
API.Client.ScheduleBidOptions.prototype.genderMultipliers;

/**
 * @type {!API.Client.ScheduleBidOptions_placement_multipliers}
 * @export
 */
API.Client.ScheduleBidOptions.prototype.placementMultipliers;

