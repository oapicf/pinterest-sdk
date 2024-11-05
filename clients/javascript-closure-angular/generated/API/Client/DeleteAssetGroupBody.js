goog.provide('API.Client.DeleteAssetGroupBody');

/**
 * Request body used to delete asset groups
 * @record
 */
API.Client.DeleteAssetGroupBody = function() {}

/**
 * List of ids of asset groups to be deleted
 * @type {!Array<!string>}
 * @export
 */
API.Client.DeleteAssetGroupBody.prototype.assetGroupsToDelete;

