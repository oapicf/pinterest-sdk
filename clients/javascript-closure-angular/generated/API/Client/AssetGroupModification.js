goog.provide('API.Client.AssetGroupModification');

/**
 * @record
 */
API.Client.AssetGroupModification = function() {}

/**
 * A list of errors associated with the asset groups. Will be returned if there is an error.
 * @type {!Array<!API.Client.AssetGroupUpdateError>}
 * @export
 */
API.Client.AssetGroupModification.prototype.exceptions;

/**
 * A list of successfully edited asset groups.
 * @type {!Array<!API.Client.AssetGroupBinding>}
 * @export
 */
API.Client.AssetGroupModification.prototype.updatedAssetGroups;

