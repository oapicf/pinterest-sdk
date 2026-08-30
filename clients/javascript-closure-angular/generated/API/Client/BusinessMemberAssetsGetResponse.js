goog.provide('API.Client.BusinessMemberAssetsGetResponse');

/**
 * Paginated response for business member assets with total count metadata.
 * @record
 */
API.Client.BusinessMemberAssetsGetResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.BusinessMemberAssetsGetResponse.prototype.bookmark;

/**
 * @type {!Array<!API.Client.AssetIdPermissions>}
 * @export
 */
API.Client.BusinessMemberAssetsGetResponse.prototype.items;

/**
 * Total number of assets matching the query
 * @type {!number}
 * @export
 */
API.Client.BusinessMemberAssetsGetResponse.prototype.totalDataCount;

/**
 * Breakdown of asset counts by entity status (ad accounts only)
 * @type {!API.Client.TotalCountByEntityStatus}
 * @export
 */
API.Client.BusinessMemberAssetsGetResponse.prototype.totalDataCountByStatus;

