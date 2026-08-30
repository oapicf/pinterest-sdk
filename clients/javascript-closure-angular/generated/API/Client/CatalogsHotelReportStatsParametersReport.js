goog.provide('API.Client.CatalogsHotelReportStatsParametersReport');

/**
 * @record
 */
API.Client.CatalogsHotelReportStatsParametersReport = function() {}

/**
 * ID of the feed entity.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelReportStatsParametersReport.prototype.feedId;

/**
 * Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelReportStatsParametersReport.prototype.processingResultId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelReportStatsParametersReport.prototype.reportType;

/**
 * Unique identifier of a catalog. If not given, oldest catalog will be used
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelReportStatsParametersReport.prototype.catalogId;

/** @enum {string} */
API.Client.CatalogsHotelReportStatsParametersReport.ReportTypeEnum = { 
  DISTRIBUTION_ISSUES: 'DISTRIBUTION_ISSUES',
}
