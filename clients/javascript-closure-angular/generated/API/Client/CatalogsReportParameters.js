goog.provide('API.Client.CatalogsReportParameters');

/**
 * Report parameters
 * @record
 */
API.Client.CatalogsReportParameters = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportParameters.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsHotelReportParametersReport}
 * @export
 */
API.Client.CatalogsReportParameters.prototype.report;

/** @enum {string} */
API.Client.CatalogsReportParameters.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
