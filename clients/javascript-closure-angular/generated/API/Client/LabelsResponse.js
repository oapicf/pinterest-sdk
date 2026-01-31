goog.provide('API.Client.LabelsResponse');

/**
 * @record
 */
API.Client.LabelsResponse = function() {}

/**
 * Labels that were not successfully applied.
 * @type {!Array<!API.Client.LabelError>}
 * @export
 */
API.Client.LabelsResponse.prototype.errors;

/**
 * @type {!Array<!API.Client.Label>}
 * @export
 */
API.Client.LabelsResponse.prototype.labels;

