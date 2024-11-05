goog.provide('API.Client.CatalogsRetailReportParameters');

/**
 * Parameters for retail report
 * @record
 */
API.Client.CatalogsRetailReportParameters = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailReportParameters.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsHotelReportParameters_report}
 * @export
 */
API.Client.CatalogsRetailReportParameters.prototype.report;

/** @enum {string} */
API.Client.CatalogsRetailReportParameters.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
