goog.provide('API.Client.BulkCampaignDeliveryEstimatesResponse');

/**
 * Bulk campaign delivery estimates response.
 * @record
 */
API.Client.BulkCampaignDeliveryEstimatesResponse = function() {}

/**
 * Per-campaign delivery estimate results, in the same order as the request.
 * @type {!Array<!API.Client.BulkCampaignDeliveryEstimatesItem>}
 * @export
 */
API.Client.BulkCampaignDeliveryEstimatesResponse.prototype.data;

