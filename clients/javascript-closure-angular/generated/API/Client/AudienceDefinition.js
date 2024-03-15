goog.provide('API.Client.AudienceDefinition');

/**
 * Queryable audience representation.
 * @record
 */
API.Client.AudienceDefinition = function() {}

/**
 * Generation date
 * @type {!string}
 * @export
 */
API.Client.AudienceDefinition.prototype.date;

/**
 * Generated audience type to request.
 * @type {!string}
 * @export
 */
API.Client.AudienceDefinition.prototype.type;

/**
 * Generated audience scope to request.
 * @type {!string}
 * @export
 */
API.Client.AudienceDefinition.prototype.scope;

