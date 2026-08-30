goog.provide('API.Client.InviteAssetsSummary');

/**
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 * @record
 */
API.Client.InviteAssetsSummary = function() {}

/**
 * List of ad account IDs and respective permission levels that will be assigned.
 * @type {!Array<!API.Client.InviteAssetsSummaryItem>}
 * @export
 */
API.Client.InviteAssetsSummary.prototype.adAccounts;

/**
 * List of profile IDs and respective permission levels that will be assigned.
 * @type {!Array<!API.Client.InviteAssetsSummaryItem>}
 * @export
 */
API.Client.InviteAssetsSummary.prototype.profiles;

