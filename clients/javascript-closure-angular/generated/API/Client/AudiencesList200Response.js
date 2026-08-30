goog.provide('API.Client.audiences_list_200_response');

/**
 * @record
 */
API.Client.AudiencesList200Response = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.AudiencesList200Response.prototype.bookmark;

/**
 * @type {!Array<!API.Client.AdAccountsAudience>}
 * @export
 */
API.Client.AudiencesList200Response.prototype.items;

