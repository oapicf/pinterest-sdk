goog.provide('API.Client.campaign_ad_preview_create_200_response_inner_data');

/**
 * Created/updated resource on success or error details on failure
 * @record
 */
API.Client.CampaignAdPreviewCreate200ResponseInnerData = function() {}

/**
 * Advertiser ID for this preview.
 * @type {!string}
 * @export
 */
API.Client.CampaignAdPreviewCreate200ResponseInnerData.prototype.adAccountId;

/**
 * Ad group ID to create a preview record for.
 * @type {!string}
 * @export
 */
API.Client.CampaignAdPreviewCreate200ResponseInnerData.prototype.adGroupId;

/**
 * Client ID that created preview.
 * @type {!number}
 * @export
 */
API.Client.CampaignAdPreviewCreate200ResponseInnerData.prototype.clientId;

/**
 * Unix timestamp in milliseconds for preview expiration.
 * @type {!number}
 * @export
 */
API.Client.CampaignAdPreviewCreate200ResponseInnerData.prototype.expiresAt;

/**
 * Whether preview link is active.
 * @type {!boolean}
 * @export
 */
API.Client.CampaignAdPreviewCreate200ResponseInnerData.prototype.isActive;

/**
 * Pin ID for pin promotion preview.
 * @type {!number}
 * @export
 */
API.Client.CampaignAdPreviewCreate200ResponseInnerData.prototype.pinId;

/**
 * Pin promotion ID for this preview.
 * @type {!number}
 * @export
 */
API.Client.CampaignAdPreviewCreate200ResponseInnerData.prototype.pinPromotionId;

/**
 * Promoted product group ID for catalog previews.
 * @type {!number}
 * @export
 */
API.Client.CampaignAdPreviewCreate200ResponseInnerData.prototype.promotedProductGroupId;

/**
 * Campaign ad preview URL.
 * @type {!string}
 * @export
 */
API.Client.CampaignAdPreviewCreate200ResponseInnerData.prototype.url;

/**
 * User ID that created preview.
 * @type {!number}
 * @export
 */
API.Client.CampaignAdPreviewCreate200ResponseInnerData.prototype.userId;

/**
 * Pin promotion preview key.
 * @type {!string}
 * @export
 */
API.Client.CampaignAdPreviewCreate200ResponseInnerData.prototype.uuid;

/**
 * @type {!API.Client.Pinterest.Lib.Error}
 * @export
 */
API.Client.CampaignAdPreviewCreate200ResponseInnerData.prototype.exceptions;

