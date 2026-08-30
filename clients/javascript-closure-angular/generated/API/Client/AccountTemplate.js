goog.provide('API.Client.AccountTemplate');

/**
 * @record
 */
API.Client.AccountTemplate = function() {}

/**
 * ID of the Ad Account that owns the template
 * @type {!string}
 * @export
 */
API.Client.AccountTemplate.prototype.adAccountId;

/**
 * IDs of the Ad Accounts that have access to this template
 * @type {!Array<!string>}
 * @export
 */
API.Client.AccountTemplate.prototype.adAccountIds;

/**
 * A list of ADE columns
 * @type {!Array<!string>}
 * @export
 */
API.Client.AccountTemplate.prototype.adeColumns;

/**
 * Attribution type for Brand/Category/SKU reports
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.AccountTemplate.prototype.attributionType;

/**
 * The length of the sliding window over which click conversions will be attributed
 * @type {!number}
 * @export
 */
API.Client.AccountTemplate.prototype.clickWindowDays;

/**
 * A list of columns to be included in the report
 * @type {!Array<!API.Client.ReportingColumn>}
 * @export
 */
API.Client.AccountTemplate.prototype.columns;

/**
 * Conversion report time type
 * @type {!API.Client.ConversionReportTimeType}
 * @export
 */
API.Client.AccountTemplate.prototype.conversionReportTimeType;

/**
 * The surface used to create this template
 * @type {!API.Client.CreationSource}
 * @export
 */
API.Client.AccountTemplate.prototype.creationSource;

/**
 * A list of custom column IDs
 * @type {!Array<!string>}
 * @export
 */
API.Client.AccountTemplate.prototype.customColumnIds;

/**
 * Additional metadata about this reporting template
 * @type {!string}
 * @export
 */
API.Client.AccountTemplate.prototype.displayMetadata;

/**
 * The length of the sliding window over which engagement conversions will be attributed
 * @type {!number}
 * @export
 */
API.Client.AccountTemplate.prototype.engagementWindowDays;

/**
 * A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values
 * @type {!string}
 * @export
 */
API.Client.AccountTemplate.prototype.filtersJson;

/**
 * @type {!API.Client.Granularity}
 * @export
 */
API.Client.AccountTemplate.prototype.granularity;

/**
 * Template ID
 * @type {!string}
 * @export
 */
API.Client.AccountTemplate.prototype.id;

/**
 * The filter on the conversion ingestion source method for conversion metrics
 * @type {!Array<!API.Client.IngestionSource>}
 * @export
 */
API.Client.AccountTemplate.prototype.ingestionSources;

/**
 * A boolean representing if this is the default view that loads for this template type
 * @type {!boolean}
 * @export
 */
API.Client.AccountTemplate.prototype.isDefault;

/**
 * A boolean that indicates if the template has been deleted
 * @type {!boolean}
 * @export
 */
API.Client.AccountTemplate.prototype.isDeleted;

/**
 * A boolean value that indicates if the user owns the template
 * @type {!boolean}
 * @export
 */
API.Client.AccountTemplate.prototype.isOwnedByUser;

/**
 * A boolean value that indicates if this template has been used to create a scheduled report
 * @type {!boolean}
 * @export
 */
API.Client.AccountTemplate.prototype.isScheduled;

/**
 * Template Name
 * @type {!string}
 * @export
 */
API.Client.AccountTemplate.prototype.name;

/**
 * The number of days prior to the day the report will be delivered at which the report will end
 * @type {!number}
 * @export
 */
API.Client.AccountTemplate.prototype.reportEndRelativeDaysInPast;

/**
 * @type {!API.Client.DataOutputFormat}
 * @export
 */
API.Client.AccountTemplate.prototype.reportFormat;

/**
 * @type {!API.Client.MetricsReportingLevel}
 * @export
 */
API.Client.AccountTemplate.prototype.reportLevel;

/**
 * The number of days prior to the day the report will be delivered at which the report will start
 * @type {!number}
 * @export
 */
API.Client.AccountTemplate.prototype.reportStartRelativeDaysInPast;

/**
 * Timezone for reporting data
 * @type {!API.Client.ReportingTimeZone}
 * @export
 */
API.Client.AccountTemplate.prototype.reportingTimeZone;

/**
 * Unified metric sort configuration
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.AccountTemplate.prototype.sortBy;

/**
 * Type of the template
 * @type {!string}
 * @export
 */
API.Client.AccountTemplate.prototype.type;

/**
 * Time of last update in seconds since Unix epoch
 * @type {!number}
 * @export
 */
API.Client.AccountTemplate.prototype.updatedTime;

/**
 * ID of the user who created the template
 * @type {!string}
 * @export
 */
API.Client.AccountTemplate.prototype.userId;

/**
 * The length of the sliding window over which view conversions will be attributed
 * @type {!number}
 * @export
 */
API.Client.AccountTemplate.prototype.viewWindowDays;

