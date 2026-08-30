goog.provide('API.Client.AssetGroupInputCreate');

/**
 * @record
 */
API.Client.AssetGroupInputCreate = function() {}

/**
 * @type {!API.Client.AssetGroupBinding}
 * @export
 */
API.Client.AssetGroupInputCreate.prototype.assetGroup;

/**
 * Asset group description.
 * @type {!string}
 * @export
 */
API.Client.AssetGroupInputCreate.prototype.assetGroupDescription;

/**
 * Asset Group name.
 * @type {!string}
 * @export
 */
API.Client.AssetGroupInputCreate.prototype.assetGroupName;

/**
 * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
 * @type {!Array<!API.Client.AssetGroupType>}
 * @export
 */
API.Client.AssetGroupInputCreate.prototype.assetGroupTypes;

