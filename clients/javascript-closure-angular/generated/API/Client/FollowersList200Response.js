goog.provide('API.Client.followers_list_200_response');

/**
 * @record
 */
API.Client.FollowersList200Response = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.FollowersList200Response.prototype.bookmark;

/**
 * @type {!Array<!API.Client.FollowUser>}
 * @export
 */
API.Client.FollowersList200Response.prototype.items;

