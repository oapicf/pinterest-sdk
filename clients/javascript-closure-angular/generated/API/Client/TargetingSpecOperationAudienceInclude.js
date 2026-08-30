goog.provide('API.Client.TargetingSpecOperationAudienceInclude');

/**
 * @record
 */
API.Client.TargetingSpecOperationAudienceInclude = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOperationAudienceInclude.prototype.field;

/**
 * @type {!API.Client.TargetingSpecListOperation}
 * @export
 */
API.Client.TargetingSpecOperationAudienceInclude.prototype.operation;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpecOperationAudienceInclude.prototype.values;

/** @enum {string} */
API.Client.TargetingSpecOperationAudienceInclude.FieldEnum = { 
  AUDIENCE_INCLUDE: 'AUDIENCE_INCLUDE',
}
