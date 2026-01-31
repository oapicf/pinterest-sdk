goog.provide('API.Client.CatalogsReportAllItemsFilter');

/**
 * @record
 */
API.Client.CatalogsReportAllItemsFilter = function() {}

/**
 * Unique identifier of a catalog. If not given, oldest catalog will be used
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportAllItemsFilter.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportAllItemsFilter.prototype.reportType;

/** @enum {string} */
API.Client.CatalogsReportAllItemsFilter.ReportTypeEnum = { 
  ALL_ITEMS: 'ALL_ITEMS',
}
