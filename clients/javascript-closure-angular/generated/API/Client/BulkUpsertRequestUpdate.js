goog.provide('API.Client.BulkUpsertRequestUpdate');

/**
 * Request for creation of entities in bulk.
 * @record
 */
API.Client.BulkUpsertRequestUpdate = function() {}

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
 * @type {!Array<!API.Client.CampaignUpdateRequest>}
 * @export
 */
API.Client.BulkUpsertRequestUpdate.prototype.campaigns;

/**
 * @type {!Array<!API.Client.catalogs_product_groups_update_request>}
 * @export
 */
API.Client.BulkUpsertRequestUpdate.prototype.catalogProductGroups;

/**
 * @type {!Array<!API.Client.KeywordUpdate>}
 * @export
 */
API.Client.BulkUpsertRequestUpdate.prototype.keywords;

/**
 * @type {!Array<!API.Client.LabelBulkUpdateRequest>}
 * @export
 */
API.Client.BulkUpsertRequestUpdate.prototype.labels;

/**
 * @type {!Array<!API.Client.ProductGroupPromotionUpdateRequest>}
 * @export
 */
API.Client.BulkUpsertRequestUpdate.prototype.productGroups;

