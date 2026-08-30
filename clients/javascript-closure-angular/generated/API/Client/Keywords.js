goog.provide('API.Client.Keywords');

/**
 * @record
 */
API.Client.Keywords = function() {}

/**
 * Keyword error
 * @type {!Array<!API.Client.KeywordError>}
 * @export
 */
API.Client.Keywords.prototype.errors;

/**
 * Keywords
 * @type {!Array<!API.Client.Keyword>}
 * @export
 */
API.Client.Keywords.prototype.keywords;

