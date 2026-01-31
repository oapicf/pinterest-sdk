goog.provide('API.Client.TargetingSpecOperationAppType');

/**
 * @record
 */
API.Client.TargetingSpecOperationAppType = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationAppType.prototype.field;

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationAppType.prototype.operation;

/**
 * @type {!Array<!API.Client.TargetingSpecAppType>}
 * @export
 */
API.Client.TargetingSpecOperationAppType.prototype.values;

/** @enum {string} */
API.Client.TargetingSpecOperationAppType.FieldEnum = { 
  APPTYPE: 'APPTYPE',
}
/** @enum {string} */
API.Client.TargetingSpecOperationAppType.OperationEnum = { 
  SET: 'SET',
  ADD: 'ADD',
  REMOVE: 'REMOVE',
}
