goog.provide('API.Client.TargetingSpecOperationLocale');

/**
 * @record
 */
API.Client.TargetingSpecOperationLocale = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationLocale.prototype.field;

/**
 * @type {!API.Client.TargetingSpecListOperation}
 * @export
 */
API.Client.TargetingSpecOperationLocale.prototype.operation;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpecOperationLocale.prototype.values;

/** @enum {string} */
API.Client.TargetingSpecOperationLocale.FieldEnum = { 
  LOCALE: 'LOCALE',
}
