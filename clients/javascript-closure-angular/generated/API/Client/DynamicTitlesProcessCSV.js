goog.provide('API.Client.DynamicTitlesProcessCSV');

/**
 * @record
 */
API.Client.DynamicTitlesProcessCSV = function() {}

/**
 * List of validation errors. Empty on success.
 * @type {!Array<!API.Client.DynamicTitlesProcessCSVError>}
 * @export
 */
API.Client.DynamicTitlesProcessCSV.prototype.errors;

/**
 * Processing status. Present on success.
 * @type {!string}
 * @export
 */
API.Client.DynamicTitlesProcessCSV.prototype.status;

