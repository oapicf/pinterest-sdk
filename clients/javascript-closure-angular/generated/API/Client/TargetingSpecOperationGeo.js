goog.provide('API.Client.TargetingSpecOperationGeo');

/**
 * @record
 */
API.Client.TargetingSpecOperationGeo = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationGeo.prototype.field;

/**
 * @type {!API.Client.TargetingSpecListOperation}
 * @export
 */
API.Client.TargetingSpecOperationGeo.prototype.operation;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpecOperationGeo.prototype.values;

/** @enum {string} */
API.Client.TargetingSpecOperationGeo.FieldEnum = { 
  GEO: 'GEO',
}
