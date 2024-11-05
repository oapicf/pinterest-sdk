goog.provide('API.Client.CatalogsHotelReportParameters');

/**
 * Parameters for hotel report
 * @record
 */
API.Client.CatalogsHotelReportParameters = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelReportParameters.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsHotelReportParameters_report}
 * @export
 */
API.Client.CatalogsHotelReportParameters.prototype.report;

/** @enum {string} */
API.Client.CatalogsHotelReportParameters.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
