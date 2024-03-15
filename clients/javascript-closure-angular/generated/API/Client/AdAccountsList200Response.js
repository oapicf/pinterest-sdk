goog.provide('API.Client.ad_accounts_list_200_response');

/**
 * @record
 */
API.Client.AdAccountsList200Response = function() {}

/**
 * Ad accounts
 * @type {!Array<!API.Client.AdAccount>}
 * @export
 */
API.Client.AdAccountsList200Response.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.AdAccountsList200Response.prototype.bookmark;

