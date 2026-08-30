goog.provide('API.Client.CampaignAdPreview');

/**
 * Campaign ad preview record.
 * @record
 */
API.Client.CampaignAdPreview = function() {}

/**
 * Advertiser ID for this preview.
 * @type {!string}
 * @export
 */
API.Client.CampaignAdPreview.prototype.adAccountId;

/**
 * Ad group ID to create a preview record for.
 * @type {!string}
 * @export
 */
API.Client.CampaignAdPreview.prototype.adGroupId;

/**
 * Client ID that created preview.
 * @type {!number}
 * @export
 */
API.Client.CampaignAdPreview.prototype.clientId;

/**
 * Unix timestamp in milliseconds for preview expiration.
 * @type {!number}
 * @export
 */
API.Client.CampaignAdPreview.prototype.expiresAt;

/**
 * Whether preview link is active.
 * @type {!boolean}
 * @export
 */
API.Client.CampaignAdPreview.prototype.isActive;

/**
 * Pin ID for pin promotion preview.
 * @type {!number}
 * @export
 */
API.Client.CampaignAdPreview.prototype.pinId;

/**
 * Pin promotion ID for this preview.
 * @type {!number}
 * @export
 */
API.Client.CampaignAdPreview.prototype.pinPromotionId;

/**
 * Promoted product group ID for catalog previews.
 * @type {!number}
 * @export
 */
API.Client.CampaignAdPreview.prototype.promotedProductGroupId;

/**
 * Campaign ad preview URL.
 * @type {!string}
 * @export
 */
API.Client.CampaignAdPreview.prototype.url;

/**
 * User ID that created preview.
 * @type {!number}
 * @export
 */
API.Client.CampaignAdPreview.prototype.userId;

/**
 * Pin promotion preview key.
 * @type {!string}
 * @export
 */
API.Client.CampaignAdPreview.prototype.uuid;

