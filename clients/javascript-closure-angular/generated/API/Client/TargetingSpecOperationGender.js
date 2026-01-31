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
 * @type {!string}
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
/** @enum {string} */
API.Client.TargetingSpecOperationGender.OperationEnum = { 
  SET: 'SET',
  ADD: 'ADD',
  REMOVE: 'REMOVE',
}
