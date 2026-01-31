goog.provide('API.Client.TargetingSpecOperationShoppingRetargeting');

/**
 * @record
 */
API.Client.TargetingSpecOperationShoppingRetargeting = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationShoppingRetargeting.prototype.field;

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationShoppingRetargeting.prototype.operation;

/**
 * @type {!Array<!API.Client.TargetingSpecShoppingRetargeting>}
 * @export
 */
API.Client.TargetingSpecOperationShoppingRetargeting.prototype.values;

/** @enum {string} */
API.Client.TargetingSpecOperationShoppingRetargeting.FieldEnum = { 
  SHOPPING_RETARGETING: 'SHOPPING_RETARGETING',
}
/** @enum {string} */
API.Client.TargetingSpecOperationShoppingRetargeting.OperationEnum = { 
  SET: 'SET',
}
