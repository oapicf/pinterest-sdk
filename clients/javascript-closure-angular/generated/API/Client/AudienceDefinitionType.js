goog.provide('API.Client.AudienceDefinitionType');

/**
 * Generated audience type to request.
 * @record
 */
API.Client.AudienceDefinitionType = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.AudienceDefinitionType.prototype.scope;

/** @enum {string} */
API.Client.AudienceDefinitionType.ScopeEnum = { 
  IMPRESSION_PLUS_ENGAGEMENT: 'IMPRESSION_PLUS_ENGAGEMENT',
  ENGAGEMENT: 'ENGAGEMENT',
}
