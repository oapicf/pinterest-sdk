goog.provide('API.Client.CreateMMMReportRequest');

/**
 * @record
 */
API.Client.CreateMMMReportRequest = function() {}

/**
 * Name of the Marketing Mix Modeling (MMM) report
 * @type {!string}
 * @export
 */
API.Client.CreateMMMReportRequest.prototype.reportName;

/**
 * Metric report start date (UTC). Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.CreateMMMReportRequest.prototype.startDate;

/**
 * Metric report end date (UTC). Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.CreateMMMReportRequest.prototype.endDate;

/**
 * DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
 * @type {!string}
 * @export
 */
API.Client.CreateMMMReportRequest.prototype.granularity;

/**
 * Level of the report
 * @type {!string}
 * @export
 */
API.Client.CreateMMMReportRequest.prototype.level;

/**
 * List of targeting types
 * @type {!Array<!API.Client.MMMReportingTargetingType>}
 * @export
 */
API.Client.CreateMMMReportRequest.prototype.targetingTypes;

/**
 * Metric and entity columns
 * @type {!Array<!API.Client.MMMReportingColumn>}
 * @export
 */
API.Client.CreateMMMReportRequest.prototype.columns;

/**
 * A List of countries for filtering
 * @type {!Array<!API.Client.TargetingAdvertiserCountry>}
 * @export
 */
API.Client.CreateMMMReportRequest.prototype.countries;

/** @enum {string} */
API.Client.CreateMMMReportRequest.GranularityEnum = { 
  DAY: 'DAY',
  WEEK: 'WEEK',
}
/** @enum {string} */
API.Client.CreateMMMReportRequest.LevelEnum = { 
  CAMPAIGN_TARGETING: 'CAMPAIGN_TARGETING',
  AD_GROUP_TARGETING: 'AD_GROUP_TARGETING',
}
