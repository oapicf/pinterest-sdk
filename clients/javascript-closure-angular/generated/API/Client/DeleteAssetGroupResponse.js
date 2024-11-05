goog.provide('API.Client.DeleteAssetGroupResponse');

/**
 * @record
 */
API.Client.DeleteAssetGroupResponse = function() {}

/**
 * A list of ids of successfully deleted asset groups.
 * @type {!Array<!string>}
 * @export
 */
API.Client.DeleteAssetGroupResponse.prototype.deletedAssetGroups;

/**
 * A list of errors associated with the asset groups. Will be returned if there is an error.
 * @type {!Array<!API.Client.DeleteAssetGroupResponse_exceptions_inner>}
 * @export
 */
API.Client.DeleteAssetGroupResponse.prototype.exceptions;

