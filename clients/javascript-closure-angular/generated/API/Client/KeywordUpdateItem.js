goog.provide('API.Client.KeywordUpdateItem');

/**
 * @record
 */
API.Client.KeywordUpdateItem = function() {}

/**
 * @type {!boolean}
 * @export
 */
API.Client.KeywordUpdateItem.prototype.archived;

/**
 * **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
 * @type {!number}
 * @export
 */
API.Client.KeywordUpdateItem.prototype.bid;

/**
 * Keyword ID .
 * @type {!string}
 * @export
 */
API.Client.KeywordUpdateItem.prototype.id;

