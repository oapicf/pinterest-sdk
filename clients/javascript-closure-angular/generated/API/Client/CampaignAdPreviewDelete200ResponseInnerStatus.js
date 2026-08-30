goog.provide('API.Client.campaign_ad_preview_delete_200_response_inner_status');

/**
 * @record
 */
API.Client.CampaignAdPreviewDelete200ResponseInnerStatus = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.CampaignAdPreviewDelete200ResponseInnerStatus.prototype.statusCode;

/**
 * @type {!number}
 * @export
 */
API.Client.CampaignAdPreviewDelete200ResponseInnerStatus.prototype.code;

/**
 * @type {!string}
 * @export
 */
API.Client.CampaignAdPreviewDelete200ResponseInnerStatus.prototype.message;

/** @enum {string} */
API.Client.CampaignAdPreviewDelete200ResponseInnerStatus.StatusCodeEnum = { 
  204: '204',
}
