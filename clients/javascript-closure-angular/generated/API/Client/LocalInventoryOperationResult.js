goog.provide('API.Client.LocalInventoryOperationResult');

/**
 * Result model for local inventory operation
 * @record
 */
API.Client.LocalInventoryOperationResult = function() {}

/**
 * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
 * @type {!Array<!API.Client.SupplementalItemValidationEvent>}
 * @export
 */
API.Client.LocalInventoryOperationResult.prototype.errors;

/**
 * Catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryOperationResult.prototype.itemId;

/**
 * Status of the item processing record
 * @type {!API.Client.SupplementalItemProcessingStatus}
 * @export
 */
API.Client.LocalInventoryOperationResult.prototype.status;

/**
 * Store code for the local inventory item
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryOperationResult.prototype.storeCode;

/**
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryOperationResult.prototype.supplementalType;

/**
 * Array with the validation warnings for the item processing record
 * @type {!Array<!API.Client.SupplementalItemValidationEvent>}
 * @export
 */
API.Client.LocalInventoryOperationResult.prototype.warnings;

/** @enum {string} */
API.Client.LocalInventoryOperationResult.SupplementalTypeEnum = { 
  LOCAL_INVENTORY: 'LOCAL_INVENTORY',
}
