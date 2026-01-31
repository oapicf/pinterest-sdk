goog.provide('API.Client.TargetingSpecOperationAgeBucket');

/**
 * @record
 */
API.Client.TargetingSpecOperationAgeBucket = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationAgeBucket.prototype.field;

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationAgeBucket.prototype.operation;

/**
 * @type {!Array<!API.Client.TargetingSpecAgeBucket>}
 * @export
 */
API.Client.TargetingSpecOperationAgeBucket.prototype.values;

/** @enum {string} */
API.Client.TargetingSpecOperationAgeBucket.FieldEnum = { 
  AGE_BUCKET: 'AGE_BUCKET',
}
/** @enum {string} */
API.Client.TargetingSpecOperationAgeBucket.OperationEnum = { 
  SET: 'SET',
}
