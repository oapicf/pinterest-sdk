goog.provide('API.Client.TargetingTemplateKeyword');

/**
 * @record
 */
API.Client.TargetingTemplateKeyword = function() {}

/**
 * @type {!API.Client.MatchType}
 * @export
 */
API.Client.TargetingTemplateKeyword.prototype.matchType;

/**
 * The keyword targeting (120 chars max).
 * @type {!string}
 * @export
 */
API.Client.TargetingTemplateKeyword.prototype.value;

