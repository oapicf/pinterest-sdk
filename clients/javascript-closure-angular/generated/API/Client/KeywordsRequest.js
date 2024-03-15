goog.provide('API.Client.KeywordsRequest');

/**
 * @record
 */
API.Client.KeywordsRequest = function() {}

/**
 * Keyword JSON array. Each array element has 3 fields
 * @type {!Array<!API.Client.KeywordsCommon>}
 * @export
 */
API.Client.KeywordsRequest.prototype.keywords;

/**
 * Keyword parent entity ID (advertiser, campaign, ad group).
 * @type {!string}
 * @export
 */
API.Client.KeywordsRequest.prototype.parentId;

