goog.provide('API.Client.KeywordCreateItem');

/**
 * @record
 */
API.Client.KeywordCreateItem = function() {}

/**
 * **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
 * @type {!number}
 * @export
 */
API.Client.KeywordCreateItem.prototype.bid;

/**
 * Keyword [match type](/docs/api-features/targeting-overview/)
 * @type {!API.Client.MatchType}
 * @export
 */
API.Client.KeywordCreateItem.prototype.matchType;

/**
 * Keyword value (120 chars max).
 * @type {!string}
 * @export
 */
API.Client.KeywordCreateItem.prototype.value;

