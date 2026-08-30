goog.provide('API.Client.CampaignBatchItem');

/**
 * Item in a batch campaign response.
 * @record
 */
API.Client.CampaignBatchItem = function() {}

/**
 * Campaign data on success.
 * @type {!API.Client.CampaignBatchResponseData}
 * @export
 */
API.Client.CampaignBatchItem.prototype.data;

/**
 * Exceptions on failure.
 * @type {!Array<!API.Client.Exception>}
 * @export
 */
API.Client.CampaignBatchItem.prototype.exceptions;

