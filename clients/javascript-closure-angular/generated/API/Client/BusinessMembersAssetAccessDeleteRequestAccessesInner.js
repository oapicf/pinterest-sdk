goog.provide('API.Client.business_members_asset_access_delete_request_accesses_inner');

/**
 * @record
 */
API.Client.BusinessMembersAssetAccessDeleteRequestAccessesInner = function() {}

/**
 * Id of the asset on which to remove member permissions.
 * @type {!string}
 * @export
 */
API.Client.BusinessMembersAssetAccessDeleteRequestAccessesInner.prototype.assetId;

/**
 * Unique identifier of the member on which to perform the asset permission removal
 * @type {!string}
 * @export
 */
API.Client.BusinessMembersAssetAccessDeleteRequestAccessesInner.prototype.memberId;

