goog.provide('API.Client.HotelProcessingRecord');

/**
 * Object describing an item processing record
 * @record
 */
API.Client.HotelProcessingRecord = function() {}

/**
 * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
 * @type {!Array<!API.Client.ItemValidationEvent>}
 * @export
 */
API.Client.HotelProcessingRecord.prototype.errors;

/**
 * The catalog hotel id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.HotelProcessingRecord.prototype.hotelId;

/**
 * @type {!API.Client.ItemProcessingStatus}
 * @export
 */
API.Client.HotelProcessingRecord.prototype.status;

/**
 * Array with the validation warnings for the item processing record
 * @type {!Array<!API.Client.ItemValidationEvent>}
 * @export
 */
API.Client.HotelProcessingRecord.prototype.warnings;

