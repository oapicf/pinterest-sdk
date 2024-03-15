goog.provide('API.Client.KeywordsResponse');

/**
 * @record
 */
API.Client.KeywordsResponse = function() {}

/**
 * @type {!Array<!API.Client.KeywordError>}
 * @export
 */
API.Client.KeywordsResponse.prototype.errors;

/**
 * @type {!Array<!API.Client.Keyword>}
 * @export
 */
API.Client.KeywordsResponse.prototype.keywords;

