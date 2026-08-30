goog.provide('API.Client.PerformancePlusCampaignSettings');

/**
 * Pinterest Performance+ campaign settings.
 * @record
 */
API.Client.PerformancePlusCampaignSettings = function() {}

/**
 * Whether to boost prospecting ad group bid.
 * @type {!boolean}
 * @export
 */
API.Client.PerformancePlusCampaignSettings.prototype.boostProspectingAdGroupBid;

/**
 * List of campaign-level exclusion pinner list IDs.
 * @type {!Array<!string>}
 * @export
 */
API.Client.PerformancePlusCampaignSettings.prototype.pinnerListExclusions;

