goog.provide('API.Client.CreativeAssetsProcessingRecord');

/**
 * Object describing an item processing record
 * @record
 */
API.Client.CreativeAssetsProcessingRecord = function() {}

/**
 * The catalog creative assets id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CreativeAssetsProcessingRecord.prototype.creativeAssetsId;

/**
 * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
 * @type {!Array<!API.Client.ItemValidationEvent>}
 * @export
 */
API.Client.CreativeAssetsProcessingRecord.prototype.errors;

/**
 * Array with the validation warnings for the item processing record
 * @type {!Array<!API.Client.ItemValidationEvent>}
 * @export
 */
API.Client.CreativeAssetsProcessingRecord.prototype.warnings;

/**
 * @type {!API.Client.ItemProcessingStatus}
 * @export
 */
API.Client.CreativeAssetsProcessingRecord.prototype.status;

