goog.provide('API.Client.TargetingSpecOperationString');

/**
 * @record
 */
API.Client.TargetingSpecOperationString = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationString.prototype.field;

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationString.prototype.operation;

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationString.prototype.value;

/** @enum {string} */
API.Client.TargetingSpecOperationString.OperationEnum = { 
  SET: 'SET',
}
