goog.provide('API.Client.CreateAssetGroupBody');

/**
 * @record
 */
API.Client.CreateAssetGroupBody = function() {}

/**
 * Asset Group name
 * @type {!string}
 * @export
 */
API.Client.CreateAssetGroupBody.prototype.assetGroupName;

/**
 * Asset group description
 * @type {!string}
 * @export
 */
API.Client.CreateAssetGroupBody.prototype.assetGroupDescription;

/**
 * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
 * @type {!Array<!API.Client.AssetGroupType>}
 * @export
 */
API.Client.CreateAssetGroupBody.prototype.assetGroupTypes;

