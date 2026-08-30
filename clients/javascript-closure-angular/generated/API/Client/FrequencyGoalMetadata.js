goog.provide('API.Client.FrequencyGoalMetadata');

/**
 * Frequency target can only be between 2 and 20
 * @record
 */
API.Client.FrequencyGoalMetadata = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.FrequencyGoalMetadata.prototype.frequency;

/**
 * @type {!API.Client.FrequencyGoalMetadataTimerange}
 * @export
 */
API.Client.FrequencyGoalMetadata.prototype.timerange;

