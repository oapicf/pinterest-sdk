goog.provide('API.Client.UpdateMemberAssetAccessBody');

/**
 * An object with a list of all the new member asset accesses.
 * @record
 */
API.Client.UpdateMemberAssetAccessBody = function() {}

/**
 * List of member asset accesses to assign or update.
 * @type {!Array<!API.Client.UpdateMemberAssetAccessItem>}
 * @export
 */
API.Client.UpdateMemberAssetAccessBody.prototype.accesses;

