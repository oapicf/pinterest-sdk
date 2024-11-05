goog.provide('API.Client.CatalogsReportDistributionIssueFilter');

/**
 * @record
 */
API.Client.CatalogsReportDistributionIssueFilter = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportDistributionIssueFilter.prototype.reportType;

/**
 * Unique identifier of a catalog. If not given, oldest catalog will be used
 * @type {!string}
 * @export
 */
API.Client.CatalogsReportDistributionIssueFilter.prototype.catalogId;

/** @enum {string} */
API.Client.CatalogsReportDistributionIssueFilter.ReportTypeEnum = { 
  DISTRIBUTION_ISSUES: 'DISTRIBUTION_ISSUES',
}
