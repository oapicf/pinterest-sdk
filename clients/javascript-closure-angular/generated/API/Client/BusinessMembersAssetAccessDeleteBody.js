goog.provide('API.Client.BusinessMembersAssetAccessDeleteBody');

/**
 * An object with a list of member asset accesses to delete.
 * @record
 */
API.Client.BusinessMembersAssetAccessDeleteBody = function() {}

/**
 * List of members asset access to be deleted
 * @type {!Array<!API.Client.DeleteMemberAssetAccessItem>}
 * @export
 */
API.Client.BusinessMembersAssetAccessDeleteBody.prototype.accesses;

