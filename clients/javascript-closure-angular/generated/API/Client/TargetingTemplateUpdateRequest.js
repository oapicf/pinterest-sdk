goog.provide('API.Client.TargetingTemplateUpdateRequest');

/**
 * @record
 */
API.Client.TargetingTemplateUpdateRequest = function() {}

/**
 * Targeting template ID
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateUpdateRequest.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateUpdateRequest.prototype.operationType;

/**
 * @type {!API.Client.TargetingSpec}
 * @export
 */
API.Client.TargetingTemplateUpdateRequest.prototype.targetingAttributes;

/** @enum {string} */
API.Client.TargetingTemplateUpdateRequest.OperationTypeEnum = { 
  REMOVE: 'REMOVE',
  UPDATE: 'UPDATE',
}
