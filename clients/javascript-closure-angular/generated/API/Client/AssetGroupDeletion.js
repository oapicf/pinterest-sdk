goog.provide('API.Client.AssetGroupDeletion');

/**
 * @record
 */
API.Client.AssetGroupDeletion = function() {}

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.AssetGroupDeletion.prototype.deletedAssetGroups;

/**
 * @type {!Array<!API.Client.AssetGroupDeleteError>}
 * @export
 */
API.Client.AssetGroupDeletion.prototype.exceptions;

