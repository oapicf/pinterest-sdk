goog.provide('API.Client.OptimizationGoalMetadata_frequency_goal_metadata');

/**
 * @record
 */
API.Client.OptimizationGoalMetadataFrequencyGoalMetadata = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.OptimizationGoalMetadataFrequencyGoalMetadata.prototype.frequency;

/**
 * User entity counts time range
 * @type {!string}
 * @export
 */
API.Client.OptimizationGoalMetadataFrequencyGoalMetadata.prototype.timerange;

/** @enum {string} */
API.Client.OptimizationGoalMetadataFrequencyGoalMetadata.TimerangeEnum = { 
  THIRTY_DAY: 'THIRTY_DAY',
  DAY: 'DAY',
  SEVEN_DAY: 'SEVEN_DAY',
  TWENTY_MINUTE: 'TWENTY_MINUTE',
  TEN_MINUTE: 'TEN_MINUTE',
  TWENTY_FOUR_HOUR: 'TWENTY_FOUR_HOUR',
}
