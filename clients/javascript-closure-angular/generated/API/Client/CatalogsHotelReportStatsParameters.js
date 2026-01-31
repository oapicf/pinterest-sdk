goog.provide('API.Client.CatalogsHotelReportStatsParameters');

/**
 * Parameters for hotel report
 * @record
 */
API.Client.CatalogsHotelReportStatsParameters = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelReportStatsParameters.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsHotelReportStatsParameters_report}
 * @export
 */
API.Client.CatalogsHotelReportStatsParameters.prototype.report;

/** @enum {string} */
API.Client.CatalogsHotelReportStatsParameters.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
