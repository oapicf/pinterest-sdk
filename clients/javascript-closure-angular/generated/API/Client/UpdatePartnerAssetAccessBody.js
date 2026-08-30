goog.provide('API.Client.UpdatePartnerAssetAccessBody');

/**
 * An object with a list of partner asset accesses to assign or update.
 * @record
 */
API.Client.UpdatePartnerAssetAccessBody = function() {}

/**
 * List of partner asset accesses to assign or update.
 * @type {!Array<!API.Client.UpdatePartnerAssetAccessItem>}
 * @export
 */
API.Client.UpdatePartnerAssetAccessBody.prototype.accesses;

