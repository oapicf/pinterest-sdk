goog.provide('API.Client.TargetingSpecOperationMaximumAge');

/**
 * @record
 */
API.Client.TargetingSpecOperationMaximumAge = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationMaximumAge.prototype.field;

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationMaximumAge.prototype.operation;

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationMaximumAge.prototype.value;

/** @enum {string} */
API.Client.TargetingSpecOperationMaximumAge.FieldEnum = { 
  MAXIMUM_AGE: 'MAXIMUM_AGE',
}
/** @enum {string} */
API.Client.TargetingSpecOperationMaximumAge.OperationEnum = { 
  SET: 'SET',
}
