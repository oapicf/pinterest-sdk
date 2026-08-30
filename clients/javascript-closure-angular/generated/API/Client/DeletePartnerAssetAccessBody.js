goog.provide('API.Client.DeletePartnerAssetAccessBody');

/**
 * An object with a list of partner asset accesses to delete.
 * @record
 */
API.Client.DeletePartnerAssetAccessBody = function() {}

/**
 * List of partner asset accesses to delete.
 * @type {!Array<!API.Client.DeletePartnerAssetAccessItem>}
 * @export
 */
API.Client.DeletePartnerAssetAccessBody.prototype.accesses;

