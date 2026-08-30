goog.provide('API.Client.AssetGroupModificationReadOrUpdate');

/**
 * @record
 */
API.Client.AssetGroupModificationReadOrUpdate = function() {}

/**
 * A list of asset groups and the data that will be used to update them.
 * @type {!Array<!API.Client.AssetGroupUpdateItemReadOrUpdateItem>}
 * @export
 */
API.Client.AssetGroupModificationReadOrUpdate.prototype.assetGroupsToUpdate;

/**
 * A list of errors associated with the asset groups. Will be returned if there is an error.
 * @type {!Array<!API.Client.AssetGroupUpdateError>}
 * @export
 */
API.Client.AssetGroupModificationReadOrUpdate.prototype.exceptions;

/**
 * A list of successfully edited asset groups.
 * @type {!Array<!API.Client.AssetGroupBinding>}
 * @export
 */
API.Client.AssetGroupModificationReadOrUpdate.prototype.updatedAssetGroups;

