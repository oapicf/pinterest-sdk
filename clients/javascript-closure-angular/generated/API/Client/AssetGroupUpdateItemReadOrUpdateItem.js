goog.provide('API.Client.AssetGroupUpdateItemReadOrUpdateItem');

/**
 * @record
 */
API.Client.AssetGroupUpdateItemReadOrUpdateItem = function() {}

/**
 * Unique identifier of the asset group to update.
 * @type {!string}
 * @export
 */
API.Client.AssetGroupUpdateItemReadOrUpdateItem.prototype.assetGroupId;

/**
 * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
 * @type {!Array<!API.Client.AssetGroupType>}
 * @export
 */
API.Client.AssetGroupUpdateItemReadOrUpdateItem.prototype.assetGroupTypes;

/**
 * A list of asset ids to add to the asset group.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AssetGroupUpdateItemReadOrUpdateItem.prototype.assetsToAdd;

/**
 * A list of asset ids to remove from the asset group.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AssetGroupUpdateItemReadOrUpdateItem.prototype.assetsToRemove;

/**
 * Asset group description.
 * @type {!string}
 * @export
 */
API.Client.AssetGroupUpdateItemReadOrUpdateItem.prototype.description;

/**
 * Asset Group name.
 * @type {!string}
 * @export
 */
API.Client.AssetGroupUpdateItemReadOrUpdateItem.prototype.name;

