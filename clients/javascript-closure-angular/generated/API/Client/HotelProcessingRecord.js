goog.provide('API.Client.HotelProcessingRecord');

/**
 * Object describing an item processing record
 * @record
 */
API.Client.HotelProcessingRecord = function() {}

/**
 * The catalog hotel id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.HotelProcessingRecord.prototype.hotelId;

/**
 * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
 * @type {!Array<!API.Client.ItemValidationEvent>}
 * @export
 */
API.Client.HotelProcessingRecord.prototype.errors;

/**
 * Array with the validation warnings for the item processing record
 * @type {!Array<!API.Client.ItemValidationEvent>}
 * @export
 */
API.Client.HotelProcessingRecord.prototype.warnings;

/**
 * @type {!API.Client.ItemProcessingStatus}
 * @export
 */
API.Client.HotelProcessingRecord.prototype.status;

