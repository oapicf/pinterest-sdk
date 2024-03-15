goog.provide('API.Client.user_following_get_200_response');

/**
 * @record
 */
API.Client.UserFollowingGet200Response = function() {}

/**
 * Users
 * @type {!Array<!API.Client.UserSummary>}
 * @export
 */
API.Client.UserFollowingGet200Response.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.UserFollowingGet200Response.prototype.bookmark;

