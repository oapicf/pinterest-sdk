goog.provide('API.Client.UsersForIndividualAssetResponse');

/**
 * An object containing the permissions a business member has on the asset.
 * @record
 */
API.Client.UsersForIndividualAssetResponse = function() {}

/**
 * Unique identifier of a business asset.
 * @type {!string}
 * @export
 */
API.Client.UsersForIndividualAssetResponse.prototype.assetId;

/**
 * Unique identifier of the business member with asset access.
 * @type {!string}
 * @export
 */
API.Client.UsersForIndividualAssetResponse.prototype.memberId;

/**
 * Permission levels member or partner has on an asset.
 * @type {!Array<!string>}
 * @export
 */
API.Client.UsersForIndividualAssetResponse.prototype.permissions;

