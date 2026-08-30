goog.provide('API.Client.ScheduleBidOptions_gender_multipliers');

/**
 * This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 * @record
 */
API.Client.ScheduleBidOptionsGenderMultipliers = function() {}

/**
 * @type {!API.Client.TargetingSpecGender}
 * @export
 */
API.Client.ScheduleBidOptionsGenderMultipliers.prototype.GENDER;

