goog.provide('API.Client.TargetingTemplateUpdateRequest');

/**
 * @record
 */
API.Client.TargetingTemplateUpdateRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateUpdateRequest.prototype.operationType;

/**
 * Targeting template ID
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateUpdateRequest.prototype.id;

/** @enum {string} */
API.Client.TargetingTemplateUpdateRequest.OperationTypeEnum = { 
  REMOVE: 'REMOVE',
}
