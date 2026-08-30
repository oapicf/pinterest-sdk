goog.provide('API.Client.CampaignUpdateRequestAllOf2');

/**
 * @record
 */
API.Client.CampaignUpdateRequestAllOf2 = function() {}

/**
 * @type {!API.Client.CampaignBidOptionsUpdate}
 * @export
 */
API.Client.CampaignUpdateRequestAllOf2.prototype.bidOptions;

/**
 * @type {!API.Client.IntendedPromotionType}
 * @export
 */
API.Client.CampaignUpdateRequestAllOf2.prototype.intendedPromotionType;

/**
 * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
 * @type {!boolean}
 * @export
 */
API.Client.CampaignUpdateRequestAllOf2.prototype.isLtvOptimized;

/**
 * Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
 * @type {!boolean}
 * @export
 */
API.Client.CampaignUpdateRequestAllOf2.prototype.isPerformancePlus;

/**
 * Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
 * @type {!boolean}
 * @export
 */
API.Client.CampaignUpdateRequestAllOf2.prototype.isTopOfSearch;

/**
 * @type {!API.Client.ObjectiveType}
 * @export
 */
API.Client.CampaignUpdateRequestAllOf2.prototype.objectiveType;

