goog.provide('API.Client.DynamicTitlesProcessCSVError');

/**
 * @record
 */
API.Client.DynamicTitlesProcessCSVError = function() {}

/**
 * The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
 * @type {!string}
 * @export
 */
API.Client.DynamicTitlesProcessCSVError.prototype.errorType;

/**
 * The row number with a validation error. -1 indicates a file-level error.
 * @type {!number}
 * @export
 */
API.Client.DynamicTitlesProcessCSVError.prototype.rowNumber;

