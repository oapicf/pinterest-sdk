goog.provide('API.Client.TargetingSpecOperationList');

/**
 * @record
 */
API.Client.TargetingSpecOperationList = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationList.prototype.field;

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationList.prototype.operation;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpecOperationList.prototype.values;

/** @enum {string} */
API.Client.TargetingSpecOperationList.OperationEnum = { 
  SET: 'SET',
  ADD: 'ADD',
  REMOVE: 'REMOVE',
}
