goog.provide('API.Client.followers_list_200_response');

/**
 * @record
 */
API.Client.FollowersList200Response = function() {}

/**
 * @type {!Array<!API.Client.UserSummary>}
 * @export
 */
API.Client.FollowersList200Response.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.FollowersList200Response.prototype.bookmark;

