goog.provide('API.Client.LabeledEntities');

/**
 * @record
 */
API.Client.LabeledEntities = function() {}

/**
 * @type {!Array<!API.Client.EntityLabel>}
 * @export
 */
API.Client.LabeledEntities.prototype.entitiesLabels;

/**
 * Labels that were not successfully applied.
 * @type {!Array<!API.Client.EntityLabelError>}
 * @export
 */
API.Client.LabeledEntities.prototype.errors;

