goog.provide('API.Client.CatalogsReportStats');

/**
 * Diagnostics aggregated numbers
 * @record
 */
API.Client.CatalogsReportStats = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportStats.prototype.reportType;

/**
 * ID of the catalog entity.
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportStats.prototype.catalogId;

/**
 * The event code that a diagnostics aggregated number references
 * @type {!number}
 * @export
 */
API.Client.CatalogsReportStats.prototype.code;

/**
 * A human-friendly label for the event code (e.g, 'SPAM')
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportStats.prototype.codeLabel;

/**
 * Title message describing the diagnostic issue
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportStats.prototype.message;

/**
 * Number of occurrences of the issue
 * @type {!number}
 * @export
 */
API.Client.CatalogsReportStats.prototype.occurrences;

/**
 * An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportStats.prototype.severity;

/**
 * Indicates if issue makes items ineligible for ads distribution
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsReportStats.prototype.ineligibleForAds;

/**
 * Indicates if issue makes items ineligible for organic distribution
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsReportStats.prototype.ineligibleForOrganic;

/** @enum {string} */
API.Client.CatalogsReportStats.ReportTypeEnum = { 
  FEED_INGESTION_ISSUES: 'FEED_INGESTION_ISSUES',
  DISTRIBUTION_ISSUES: 'DISTRIBUTION_ISSUES',
}
/** @enum {string} */
API.Client.CatalogsReportStats.SeverityEnum = { 
  WARN: 'WARN',
  ERROR: 'ERROR',
}
