goog.provide('API.Client.TargetingSpecOperationMinMaxAge');

/**
 * @record
 */
API.Client.TargetingSpecOperationMinMaxAge = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationMinMaxAge.prototype.field;

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationMinMaxAge.prototype.operation;

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationMinMaxAge.prototype.value;

/** @enum {string} */
API.Client.TargetingSpecOperationMinMaxAge.FieldEnum = { 
  MINIMUM_AGE: 'MINIMUM_AGE',
  MAXIMUM_AGE: 'MAXIMUM_AGE',
}
/** @enum {string} */
API.Client.TargetingSpecOperationMinMaxAge.OperationEnum = { 
  SET: 'SET',
}
