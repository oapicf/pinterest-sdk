goog.provide('API.Client.ItemProcessingRecord');

/**
 * Object describing an item processing record
 * @record
 */
API.Client.ItemProcessingRecord = function() {}

/**
 * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
 * @type {!Array<!API.Client.ItemValidationEvent>}
 * @export
 */
API.Client.ItemProcessingRecord.prototype.errors;

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemProcessingRecord.prototype.itemId;

/**
 * @type {!API.Client.ItemProcessingStatus}
 * @export
 */
API.Client.ItemProcessingRecord.prototype.status;

/**
 * Array with the validation warnings for the item processing record
 * @type {!Array<!API.Client.ItemValidationEvent>}
 * @export
 */
API.Client.ItemProcessingRecord.prototype.warnings;

