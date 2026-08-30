goog.provide('API.Client.TargetingSpecOperationGender');

/**
 * @record
 */
API.Client.TargetingSpecOperationGender = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationGender.prototype.field;

/**
 * @type {!API.Client.TargetingSpecListOperation}
 * @export
 */
API.Client.TargetingSpecOperationGender.prototype.operation;

/**
 * @type {!Array<!API.Client.TargetingSpecGender>}
 * @export
 */
API.Client.TargetingSpecOperationGender.prototype.values;

/** @enum {string} */
API.Client.TargetingSpecOperationGender.FieldEnum = { 
  GENDER: 'GENDER',
}
