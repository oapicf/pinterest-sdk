goog.provide('API.Client.BulkUpsertRequestCreate');

/**
 * Request for creation of entities in bulk.
 * @record
 */
API.Client.BulkUpsertRequestCreate = function() {}

/**
 * @type {!Array<!API.Client.CampaignCreateRequest>}
 * @export
 */
API.Client.BulkUpsertRequestCreate.prototype.campaigns;

/**
 * @type {!Array<!API.Client.AdGroupCreateRequest>}
 * @export
 */
API.Client.BulkUpsertRequestCreate.prototype.adGroups;

/**
 * @type {!Array<!API.Client.AdCreateRequest>}
 * @export
 */
API.Client.BulkUpsertRequestCreate.prototype.ads;

/**
 * @type {!Array<!API.Client.ProductGroupPromotionCreateRequest>}
 * @export
 */
API.Client.BulkUpsertRequestCreate.prototype.productGroups;

/**
 * @type {!Array<!API.Client.KeywordsRequest>}
 * @export
 */
API.Client.BulkUpsertRequestCreate.prototype.keywords;

