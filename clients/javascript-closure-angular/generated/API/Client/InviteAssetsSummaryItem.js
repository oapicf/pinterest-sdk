goog.provide('API.Client.InviteAssetsSummaryItem');

/**
 * @record
 */
API.Client.InviteAssetsSummaryItem = function() {}

/**
 * Unique identifier of the asset.
 * @type {!string}
 * @export
 */
API.Client.InviteAssetsSummaryItem.prototype.id;

/**
 * Permission levels member or partner has on an asset.
 * @type {!Array<!string>}
 * @export
 */
API.Client.InviteAssetsSummaryItem.prototype.permissions;

