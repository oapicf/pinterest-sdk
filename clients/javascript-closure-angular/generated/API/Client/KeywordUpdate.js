goog.provide('API.Client.KeywordUpdate');

/**
 * @record
 */
API.Client.KeywordUpdate = function() {}

/**
 * Keyword ID.
 * @type {!string}
 * @export
 */
API.Client.KeywordUpdate.prototype.id;

/**
 * Is keyword archived?
 * @type {!boolean}
 * @export
 */
API.Client.KeywordUpdate.prototype.archived;

/**
 * Keyword custom bid in microcurrency - null if inherited from parent ad group.
 * @type {!number}
 * @export
 */
API.Client.KeywordUpdate.prototype.bid;

