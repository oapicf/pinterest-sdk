goog.provide('API.Client.UpdateAssetGroupResponse');

/**
 * @record
 */
API.Client.UpdateAssetGroupResponse = function() {}

/**
 * A list of successfully edited asset groups.
 * @type {!Array<!API.Client.AssetGroupBinding>}
 * @export
 */
API.Client.UpdateAssetGroupResponse.prototype.updatedAssetGroups;

/**
 * A list of errors associated with the asset groups. Will be returned if there is an error.
 * @type {!Array<!API.Client.UpdateAssetGroupResponse_exceptions_inner>}
 * @export
 */
API.Client.UpdateAssetGroupResponse.prototype.exceptions;

