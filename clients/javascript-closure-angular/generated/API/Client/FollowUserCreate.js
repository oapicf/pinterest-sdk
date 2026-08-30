goog.provide('API.Client.FollowUserCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.FollowUserCreate = function() {}

/**
 *   Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed.
 * @type {!boolean}
 * @export
 */
API.Client.FollowUserCreate.prototype.autoFollow;

