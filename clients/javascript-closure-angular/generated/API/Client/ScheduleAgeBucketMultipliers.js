goog.provide('API.Client.ScheduleAgeBucketMultipliers');

/**
 * This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 * @record
 */
API.Client.ScheduleAgeBucketMultipliers = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ScheduleAgeBucketMultipliers.prototype.AGE_BUCKET;

/** @enum {string} */
API.Client.ScheduleAgeBucketMultipliers.AGE_BUCKETEnum = { 
  18-24: '18-24',
  25-34: '25-34',
  35-44: '35-44',
  45-49: '45-49',
  50-54: '50-54',
  55-64: '55-64',
  65+: '65+',
}
