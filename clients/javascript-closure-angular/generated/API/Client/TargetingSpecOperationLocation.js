goog.provide('API.Client.TargetingSpecOperationLocation');

/**
 * @record
 */
API.Client.TargetingSpecOperationLocation = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationLocation.prototype.field;

/**
 * @type {!API.Client.TargetingSpecListOperation}
 * @export
 */
API.Client.TargetingSpecOperationLocation.prototype.operation;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpecOperationLocation.prototype.values;

/** @enum {string} */
API.Client.TargetingSpecOperationLocation.FieldEnum = { 
  LOCATION: 'LOCATION',
}
