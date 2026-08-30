goog.provide('API.Client.SupplementalOperationResult');

/**
 * Result of a supplemental item operation, discriminated by supplemental_type
 * @record
 */
API.Client.SupplementalOperationResult = function() {}

/**
 * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
 * @type {!Array<!API.Client.SupplementalItemValidationEvent>}
 * @export
 */
API.Client.SupplementalOperationResult.prototype.errors;

/**
 * Catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.SupplementalOperationResult.prototype.itemId;

/**
 * Status of the item processing record
 * @type {!API.Client.SupplementalItemProcessingStatus}
 * @export
 */
API.Client.SupplementalOperationResult.prototype.status;

/**
 * Store code for the local inventory item
 * @type {!string}
 * @export
 */
API.Client.SupplementalOperationResult.prototype.storeCode;

/**
 * @type {!string}
 * @export
 */
API.Client.SupplementalOperationResult.prototype.supplementalType;

/**
 * Array with the validation warnings for the item processing record
 * @type {!Array<!API.Client.SupplementalItemValidationEvent>}
 * @export
 */
API.Client.SupplementalOperationResult.prototype.warnings;

/** @enum {string} */
API.Client.SupplementalOperationResult.SupplementalTypeEnum = { 
  LOCAL_INVENTORY: 'LOCAL_INVENTORY',
}
