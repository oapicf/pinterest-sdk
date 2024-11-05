goog.provide('API.Client.CatalogsHotelReportParameters_report');

/**
 * @record
 */
API.Client.CatalogsHotelReportParametersReport = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelReportParametersReport.prototype.reportType;

/**
 * ID of the feed entity.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelReportParametersReport.prototype.feedId;

/**
 * Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelReportParametersReport.prototype.processingResultId;

/**
 * Unique identifier of a catalog. If not given, oldest catalog will be used
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelReportParametersReport.prototype.catalogId;

/** @enum {string} */
API.Client.CatalogsHotelReportParametersReport.ReportTypeEnum = { 
  FEED_INGESTION_ISSUES: 'FEED_INGESTION_ISSUES',
  DISTRIBUTION_ISSUES: 'DISTRIBUTION_ISSUES',
}
