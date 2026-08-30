goog.provide('API.Client.TargetingSpecOperationInterest');

/**
 * @record
 */
API.Client.TargetingSpecOperationInterest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationInterest.prototype.field;

/**
 * @type {!API.Client.TargetingSpecListOperation}
 * @export
 */
API.Client.TargetingSpecOperationInterest.prototype.operation;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpecOperationInterest.prototype.values;

/** @enum {string} */
API.Client.TargetingSpecOperationInterest.FieldEnum = { 
  INTEREST: 'INTEREST',
}
