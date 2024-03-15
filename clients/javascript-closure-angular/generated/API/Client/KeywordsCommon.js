goog.provide('API.Client.KeywordsCommon');

/**
 * @record
 */
API.Client.KeywordsCommon = function() {}

/**
 * Keyword custom bid in microcurrency - null if inherited from parent ad group.
 * @type {!number}
 * @export
 */
API.Client.KeywordsCommon.prototype.bid;

/**
 * @type {!API.Client.MatchTypeResponse}
 * @export
 */
API.Client.KeywordsCommon.prototype.matchType;

/**
 * Keyword value (120 chars max).
 * @type {!string}
 * @export
 */
API.Client.KeywordsCommon.prototype.value;

