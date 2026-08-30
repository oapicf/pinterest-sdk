goog.provide('API.Client.CampaignBatchWriteResponseModel');

/**
 * Response model for batch campaign write operations.
 * @record
 */
API.Client.CampaignBatchWriteResponseModel = function() {}

/**
 * @type {!Array<!API.Client.CampaignBatchItem>}
 * @export
 */
API.Client.CampaignBatchWriteResponseModel.prototype.items;

