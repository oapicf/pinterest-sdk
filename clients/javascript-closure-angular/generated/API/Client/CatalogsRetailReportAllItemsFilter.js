goog.provide('API.Client.CatalogsRetailReportAllItemsFilter');

/**
 * ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
 * @record
 */
API.Client.CatalogsRetailReportAllItemsFilter = function() {}

/**
 * Unique identifier of a catalog. If not given, oldest catalog will be used
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailReportAllItemsFilter.prototype.catalogId;

/**
 * Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailReportAllItemsFilter.prototype.productGroupId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailReportAllItemsFilter.prototype.reportType;

/** @enum {string} */
API.Client.CatalogsRetailReportAllItemsFilter.ReportTypeEnum = { 
  ALL_ITEMS: 'ALL_ITEMS',
}
