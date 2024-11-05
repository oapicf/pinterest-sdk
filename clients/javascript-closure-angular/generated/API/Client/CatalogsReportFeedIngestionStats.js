goog.provide('API.Client.CatalogsReportFeedIngestionStats');

/**
 * @record
 */
API.Client.CatalogsReportFeedIngestionStats = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportFeedIngestionStats.prototype.reportType;

/**
 * ID of the catalog entity.
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportFeedIngestionStats.prototype.catalogId;

/**
 * The event code that a diagnostics aggregated number references
 * @type {!number}
 * @export
 */
API.Client.CatalogsReportFeedIngestionStats.prototype.code;

/**
 * A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID')
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportFeedIngestionStats.prototype.codeLabel;

/**
 * Title message describing the diagnostic issue
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportFeedIngestionStats.prototype.message;

/**
 * Number of occurrences of the issue
 * @type {!number}
 * @export
 */
API.Client.CatalogsReportFeedIngestionStats.prototype.occurrences;

/**
 * An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportFeedIngestionStats.prototype.severity;

/** @enum {string} */
API.Client.CatalogsReportFeedIngestionStats.ReportTypeEnum = { 
  FEED_INGESTION_ISSUES: 'FEED_INGESTION_ISSUES',
}
/** @enum {string} */
API.Client.CatalogsReportFeedIngestionStats.SeverityEnum = { 
  WARN: 'WARN',
  ERROR: 'ERROR',
}
