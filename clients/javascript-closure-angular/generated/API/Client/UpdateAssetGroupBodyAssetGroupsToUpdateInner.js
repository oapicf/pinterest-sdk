goog.provide('API.Client.UpdateAssetGroupBody_asset_groups_to_update_inner');

/**
 * @record
 */
API.Client.UpdateAssetGroupBodyAssetGroupsToUpdateInner = function() {}

/**
 * Unique identifier of the asset group to update.
 * @type {!string}
 * @export
 */
API.Client.UpdateAssetGroupBodyAssetGroupsToUpdateInner.prototype.assetGroupId;

/**
 * Asset Group name
 * @type {!string}
 * @export
 */
API.Client.UpdateAssetGroupBodyAssetGroupsToUpdateInner.prototype.name;

/**
 * Asset group description
 * @type {!string}
 * @export
 */
API.Client.UpdateAssetGroupBodyAssetGroupsToUpdateInner.prototype.description;

/**
 * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
 * @type {!Array<!API.Client.AssetGroupType>}
 * @export
 */
API.Client.UpdateAssetGroupBodyAssetGroupsToUpdateInner.prototype.assetGroupTypes;

/**
 * A list of asset ids to add to the asset group.
 * @type {!Array<!string>}
 * @export
 */
API.Client.UpdateAssetGroupBodyAssetGroupsToUpdateInner.prototype.assetsToAdd;

/**
 * A list of asset ids to remove from the asset group.
 * @type {!Array<!string>}
 * @export
 */
API.Client.UpdateAssetGroupBodyAssetGroupsToUpdateInner.prototype.assetsToRemove;

