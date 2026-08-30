goog.provide('API.Client.TargetingTemplateUpdateRequestReadOrUpdate');

/**
 * @record
 */
API.Client.TargetingTemplateUpdateRequestReadOrUpdate = function() {}

/**
 * Targeting template ID
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateUpdateRequestReadOrUpdate.prototype.id;

/**
 * @type {!API.Client.AudienceUpdateOperationType}
 * @export
 */
API.Client.TargetingTemplateUpdateRequestReadOrUpdate.prototype.operationType;

/**
 * targeting profile attributes
 * @type {!API.Client.TargetingSpecOptimal}
 * @export
 */
API.Client.TargetingTemplateUpdateRequestReadOrUpdate.prototype.targetingAttributes;

