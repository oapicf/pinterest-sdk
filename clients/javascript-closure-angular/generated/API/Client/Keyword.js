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
 * Keyword ID .
 * @type {!string}
 * @export
 */
API.Client.Keyword.prototype.id;

/**
 * Keyword parent entity ID (advertiser, campaign, ad group).
 * @type {!string}
 * @export
 */
API.Client.Keyword.prototype.parentId;

/**
 * Parent entity type
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
 * Keyword custom bid in microcurrency - null if inherited from parent ad group.
 * @type {!number}
 * @export
 */
API.Client.Keyword.prototype.bid;

/**
 * @type {!API.Client.MatchTypeResponse}
 * @export
 */
API.Client.Keyword.prototype.matchType;

/**
 * Keyword value (120 chars max).
 * @type {!string}
 * @export
 */
API.Client.Keyword.prototype.value;

