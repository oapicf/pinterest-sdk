goog.provide('API.Client.AssetGroupBinding');

/**
 * @record
 */
API.Client.AssetGroupBinding = function() {}

/**
 * Asset Group ID.
 * @type {!string}
 * @export
 */
API.Client.AssetGroupBinding.prototype.id;

/**
 * Asset Group name
 * @type {!string}
 * @export
 */
API.Client.AssetGroupBinding.prototype.assetGroupName;

/**
 * Asset group description
 * @type {!string}
 * @export
 */
API.Client.AssetGroupBinding.prototype.assetGroupDescription;

/**
 * Asset group types
 * @type {!Array<!string>}
 * @export
 */
API.Client.AssetGroupBinding.prototype.assetGroupTypes;

/**
 * A list of ad account IDs under the asset group
 * @type {!Array<!string>}
 * @export
 */
API.Client.AssetGroupBinding.prototype.adAccountsIds;

/**
 * A list of profile IDs under asset group
 * @type {!Array<!string>}
 * @export
 */
API.Client.AssetGroupBinding.prototype.profilesIds;

/**
 * The creation time of the asset group
 * @type {!number}
 * @export
 */
API.Client.AssetGroupBinding.prototype.createdTime;

/**
 * The last update time of the asset group
 * @type {!number}
 * @export
 */
API.Client.AssetGroupBinding.prototype.updatedTime;

/**
 * The data of the business that owns the asset group.
 * @type {!API.Client.BusinessAccessUserSummary}
 * @export
 */
API.Client.AssetGroupBinding.prototype.owner;

/**
 * The data of the user that created the asset group.
 * @type {!API.Client.BusinessAccessUserSummary}
 * @export
 */
API.Client.AssetGroupBinding.prototype.createdBy;

