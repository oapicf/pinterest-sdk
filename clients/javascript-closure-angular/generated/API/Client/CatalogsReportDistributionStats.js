goog.provide('API.Client.CatalogsReportDistributionStats');

/**
 * @record
 */
API.Client.CatalogsReportDistributionStats = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportDistributionStats.prototype.reportType;

/**
 * ID of the catalog entity.
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportDistributionStats.prototype.catalogId;

/**
 * The event code that a diagnostics aggregated number references
 * @type {!number}
 * @export
 */
API.Client.CatalogsReportDistributionStats.prototype.code;

/**
 * A human-friendly label for the event code (e.g, 'SPAM')
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportDistributionStats.prototype.codeLabel;

/**
 * Title message describing the diagnostic issue
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportDistributionStats.prototype.message;

/**
 * Number of occurrences of the issue
 * @type {!number}
 * @export
 */
API.Client.CatalogsReportDistributionStats.prototype.occurrences;

/**
 * Indicates if issue makes items ineligible for ads distribution
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsReportDistributionStats.prototype.ineligibleForAds;

/**
 * Indicates if issue makes items ineligible for organic distribution
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsReportDistributionStats.prototype.ineligibleForOrganic;

/** @enum {string} */
API.Client.CatalogsReportDistributionStats.ReportTypeEnum = { 
  DISTRIBUTION_ISSUES: 'DISTRIBUTION_ISSUES',
}
