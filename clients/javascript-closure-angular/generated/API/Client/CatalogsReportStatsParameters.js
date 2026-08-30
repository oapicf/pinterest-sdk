goog.provide('API.Client.CatalogsReportStatsParameters');

/**
 * Report stats parameters
 * @record
 */
API.Client.CatalogsReportStatsParameters = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportStatsParameters.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsHotelReportStatsParametersReport}
 * @export
 */
API.Client.CatalogsReportStatsParameters.prototype.report;

/** @enum {string} */
API.Client.CatalogsReportStatsParameters.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
