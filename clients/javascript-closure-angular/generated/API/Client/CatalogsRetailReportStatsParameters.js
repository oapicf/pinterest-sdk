goog.provide('API.Client.CatalogsRetailReportStatsParameters');

/**
 * Parameters for retail report
 * @record
 */
API.Client.CatalogsRetailReportStatsParameters = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailReportStatsParameters.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsRetailReportStatsParametersReport}
 * @export
 */
API.Client.CatalogsRetailReportStatsParameters.prototype.report;

/** @enum {string} */
API.Client.CatalogsRetailReportStatsParameters.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
