goog.provide('API.Client.KeywordUpdate');

/**
 * @record
 */
API.Client.KeywordUpdate = function() {}

/**
 * Is keyword archived?
 * @type {!boolean}
 * @export
 */
API.Client.KeywordUpdate.prototype.archived;

/**
 * </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
 * @type {!number}
 * @export
 */
API.Client.KeywordUpdate.prototype.bid;

/**
 * Keyword ID.
 * @type {!string}
 * @export
 */
API.Client.KeywordUpdate.prototype.id;

