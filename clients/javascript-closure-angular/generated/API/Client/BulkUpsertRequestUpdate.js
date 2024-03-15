goog.provide('API.Client.BulkUpsertRequestUpdate');

/**
 * Request for creation of entities in bulk.
 * @record
 */
API.Client.BulkUpsertRequestUpdate = function() {}

/**
 * @type {!Array<!API.Client.CampaignUpdateRequest>}
 * @export
 */
API.Client.BulkUpsertRequestUpdate.prototype.campaigns;

/**
 * @type {!Array<!API.Client.AdGroupUpdateRequest>}
 * @export
 */
API.Client.BulkUpsertRequestUpdate.prototype.adGroups;

/**
 * @type {!Array<!API.Client.AdUpdateRequest>}
 * @export
 */
API.Client.BulkUpsertRequestUpdate.prototype.ads;

/**
 * @type {!Array<!API.Client.ProductGroupPromotionUpdateRequest>}
 * @export
 */
API.Client.BulkUpsertRequestUpdate.prototype.productGroups;

/**
 * @type {!Array<!API.Client.KeywordUpdate>}
 * @export
 */
API.Client.BulkUpsertRequestUpdate.prototype.keywords;

