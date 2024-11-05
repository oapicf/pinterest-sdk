goog.provide('API.Client.CatalogsReportFeedIngestionFilter');

/**
 * @record
 */
API.Client.CatalogsReportFeedIngestionFilter = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportFeedIngestionFilter.prototype.reportType;

/**
 * ID of the feed entity.
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportFeedIngestionFilter.prototype.feedId;

/**
 * Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportFeedIngestionFilter.prototype.processingResultId;

/** @enum {string} */
API.Client.CatalogsReportFeedIngestionFilter.ReportTypeEnum = { 
  FEED_INGESTION_ISSUES: 'FEED_INGESTION_ISSUES',
}
