goog.provide('API.Client.TargetingSpecOperationMinimumAge');

/**
 * @record
 */
API.Client.TargetingSpecOperationMinimumAge = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationMinimumAge.prototype.field;

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationMinimumAge.prototype.operation;

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationMinimumAge.prototype.value;

/** @enum {string} */
API.Client.TargetingSpecOperationMinimumAge.FieldEnum = { 
  MINIMUM_AGE: 'MINIMUM_AGE',
}
/** @enum {string} */
API.Client.TargetingSpecOperationMinimumAge.OperationEnum = { 
  SET: 'SET',
}
