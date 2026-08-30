goog.provide('API.Client.TargetingSpecOperationGeoExclude');

/**
 * @record
 */
API.Client.TargetingSpecOperationGeoExclude = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationGeoExclude.prototype.field;

/**
 * @type {!API.Client.TargetingSpecListOperation}
 * @export
 */
API.Client.TargetingSpecOperationGeoExclude.prototype.operation;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpecOperationGeoExclude.prototype.values;

/** @enum {string} */
API.Client.TargetingSpecOperationGeoExclude.FieldEnum = { 
  GEO_EXCLUDE: 'GEO_EXCLUDE',
}
