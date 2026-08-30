goog.provide('API.Client.TargetingSpecOperationLocationExclude');

/**
 * @record
 */
API.Client.TargetingSpecOperationLocationExclude = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationLocationExclude.prototype.field;

/**
 * @type {!API.Client.TargetingSpecListOperation}
 * @export
 */
API.Client.TargetingSpecOperationLocationExclude.prototype.operation;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpecOperationLocationExclude.prototype.values;

/** @enum {string} */
API.Client.TargetingSpecOperationLocationExclude.FieldEnum = { 
  LOCATION_EXCLUDE: 'LOCATION_EXCLUDE',
}
