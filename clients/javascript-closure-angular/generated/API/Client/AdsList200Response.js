goog.provide('API.Client.ads_list_200_response');

/**
 * @record
 */
API.Client.AdsList200Response = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.AdsList200Response.prototype.bookmark;

/**
 * @type {!Array<!API.Client.Ad>}
 * @export
 */
API.Client.AdsList200Response.prototype.items;

