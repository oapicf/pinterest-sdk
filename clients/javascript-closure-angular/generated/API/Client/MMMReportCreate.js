goog.provide('API.Client.MMMReportCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.MMMReportCreate = function() {}

/**
 * Advertiser IDs for multi-advertiser report
 * @type {!Array<!string>}
 * @export
 */
API.Client.MMMReportCreate.prototype.advertiserIds;

/**
 * Metric and entity columns
 * @type {!Array<!API.Client.MMMReportingColumn>}
 * @export
 */
API.Client.MMMReportCreate.prototype.columns;

/**
 * A List of countries for filtering
 * @type {!Array<!API.Client.TargetingAdvertiserCountry>}
 * @export
 */
API.Client.MMMReportCreate.prototype.countries;

/**
 * List of custom column IDs
 * @type {!Array<!string>}
 * @export
 */
API.Client.MMMReportCreate.prototype.customColumnIds;

/**
 * Metric report end date (UTC). Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.MMMReportCreate.prototype.endDate;

/**
 *   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
 * @type {!API.Client.MMMReportGranularity}
 * @export
 */
API.Client.MMMReportCreate.prototype.granularity;

/**
 * Level of the report
 * @type {!API.Client.MMMReportLevel}
 * @export
 */
API.Client.MMMReportCreate.prototype.level;

/**
 * Name of the Marketing Mix Modeling (MMM) report
 * @type {!string}
 * @export
 */
API.Client.MMMReportCreate.prototype.reportName;

/**
 * Metric report start date (UTC). Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.MMMReportCreate.prototype.startDate;

/**
 * List of targeting types
 * @type {!Array<!API.Client.MMMReportingTargetingType>}
 * @export
 */
API.Client.MMMReportCreate.prototype.targetingTypes;

