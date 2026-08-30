goog.provide('API.Client.Keyword');

/**
 * @record
 */
API.Client.Keyword = function() {}

/**
 * @type {!boolean}
 * @export
 */
API.Client.Keyword.prototype.archived;

/**
 * **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
 * @type {!number}
 * @export
 */
API.Client.Keyword.prototype.bid;

/**
 * Keyword ID .
 * @type {!string}
 * @export
 */
API.Client.Keyword.prototype.id;

/**
 * Keyword [match type](/docs/api-features/targeting-overview/)
 * @type {!API.Client.MatchType}
 * @export
 */
API.Client.Keyword.prototype.matchType;

/**
 * Keyword parent entity ID (advertiser, campaign, ad group).
 * @type {!string}
 * @export
 */
API.Client.Keyword.prototype.parentId;

/**
 * Parent entity type (advertiser, campaign, ad group).
 * @type {!string}
 * @export
 */
API.Client.Keyword.prototype.parentType;

/**
 * Always keyword
 * @type {!string}
 * @export
 */
API.Client.Keyword.prototype.type;

/**
 * Keyword value (120 chars max).
 * @type {!string}
 * @export
 */
API.Client.Keyword.prototype.value;

