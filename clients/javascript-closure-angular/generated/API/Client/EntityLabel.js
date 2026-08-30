goog.provide('API.Client.EntityLabel');

/**
 * @record
 */
API.Client.EntityLabel = function() {}

/**
 * Entity ID to apply label to.
 * @type {!string}
 * @export
 */
API.Client.EntityLabel.prototype.entityId;

/**
 * @type {!API.Client.LabelParentType}
 * @export
 */
API.Client.EntityLabel.prototype.entityType;

/**
 * Label ID.
 * @type {!string}
 * @export
 */
API.Client.EntityLabel.prototype.labelId;

/**
 * @type {!API.Client.EntityLabelStatus}
 * @export
 */
API.Client.EntityLabel.prototype.status;

