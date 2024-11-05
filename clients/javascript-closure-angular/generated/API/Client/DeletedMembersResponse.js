goog.provide('API.Client.DeletedMembersResponse');

/**
 * An object with a list of members that were deleted.
 * @record
 */
API.Client.DeletedMembersResponse = function() {}

/**
 * List of members whose business membership have been terminated.
 * @type {!Array<!string>}
 * @export
 */
API.Client.DeletedMembersResponse.prototype.deletedMembers;

