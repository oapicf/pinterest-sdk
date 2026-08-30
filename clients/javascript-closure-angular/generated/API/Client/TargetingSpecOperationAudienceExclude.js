goog.provide('API.Client.TargetingSpecOperationAudienceExclude');

/**
 * @record
 */
API.Client.TargetingSpecOperationAudienceExclude = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationAudienceExclude.prototype.field;

/**
 * @type {!API.Client.TargetingSpecListOperation}
 * @export
 */
API.Client.TargetingSpecOperationAudienceExclude.prototype.operation;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpecOperationAudienceExclude.prototype.values;

/** @enum {string} */
API.Client.TargetingSpecOperationAudienceExclude.FieldEnum = { 
  AUDIENCE_EXCLUDE: 'AUDIENCE_EXCLUDE',
}
