goog.provide('API.Client.TargetingSpecOperations');

/**
 * @record
 */
API.Client.TargetingSpecOperations = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperations.prototype.field;

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperations.prototype.operation;

/**
 * @type {!Array<!API.Client.TargetingSpecShoppingRetargeting>}
 * @export
 */
API.Client.TargetingSpecOperations.prototype.values;

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperations.prototype.value;

/** @enum {string} */
API.Client.TargetingSpecOperations.FieldEnum = { 
  MINIMUM_AGE: 'MINIMUM_AGE',
}
/** @enum {string} */
API.Client.TargetingSpecOperations.OperationEnum = { 
  SET: 'SET',
}
