goog.provide('API.Client.BulkUpsertRequestCreate');

/**
 * Request for creation of entities in bulk.
 * @record
 */
API.Client.BulkUpsertRequestCreate = function() {}

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
 * @type {!Array<!API.Client.CampaignCreateRequest>}
 * @export
 */
API.Client.BulkUpsertRequestCreate.prototype.campaigns;

/**
 * @type {!Array<!API.Client.BulkUpsertRequestCreateCatalogProductGroupsItems>}
 * @export
 */
API.Client.BulkUpsertRequestCreate.prototype.catalogProductGroups;

/**
 * @type {!Array<!API.Client.KeywordsRequest>}
 * @export
 */
API.Client.BulkUpsertRequestCreate.prototype.keywords;

/**
 * @type {!Array<!API.Client.LabelBulkCreateRequest>}
 * @export
 */
API.Client.BulkUpsertRequestCreate.prototype.labels;

/**
 * @type {!Array<!API.Client.ProductGroupPromotionCreateRequest>}
 * @export
 */
API.Client.BulkUpsertRequestCreate.prototype.productGroups;

/**
 * @type {!Array<!API.Client.ScheduleCreateRequest>}
 * @export
 */
API.Client.BulkUpsertRequestCreate.prototype.schedules;

