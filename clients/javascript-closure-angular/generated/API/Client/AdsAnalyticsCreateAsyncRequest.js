goog.provide('API.Client.AdsAnalyticsCreateAsyncRequest');

/**
 * @record
 */
API.Client.AdsAnalyticsCreateAsyncRequest = function() {}

/**
 * List of ad group ids
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.adGroupIds;

/**
 * List of values for filtering
 * @type {!Array<!API.Client.AdGroupSummaryStatus>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.adGroupStatuses;

/**
 * List of ad ids. This parameter is not supported for Product Item level reports.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.adIds;

/**
 * List of values for filtering. This parameter is not supported for Product Item level reports.
 * @type {!Array<!API.Client.PinPromotionSummaryStatus>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.adStatuses;

/**
 * List of attribution types for the conversion report.
 * @type {!Array<!API.Client.ConversionReportAttributionType>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.attributionTypes;

/**
 * Campaign brand label for filtering.
 * @type {!string}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.campaignBrandLabel;

/**
 * Campaign custom label for filtering.
 * @type {!string}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.campaignCustomLabel;

/**
 * List of campaign ids
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.campaignIds;

/**
 * List of values for filtering. [\"WEB_SESSIONS\"] is in BETA.
 * @type {!Array<!API.Client.CampaignObjectiveType>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.campaignObjectiveTypes;

/**
 * List of status values for filtering
 * @type {!Array<!API.Client.CampaignSummaryStatus>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.campaignStatuses;

/**
 * Number of days to use as the conversion attribution window for a pin click action.
 * @type {!API.Client.ConversionAttributionWindowDays}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.clickWindowDays;

/**
 * Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
 * @type {!Array<!API.Client.ReportingColumnAsync>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.columns;

/**
 * Determines if the targeting types included in the request should be consolidated into a single breakdown.
 * @type {!boolean}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.combineTargetingTypes;

/**
 * Date dimension for conversion metrics.
 * @type {!API.Client.ConversionReportTimeType}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.conversionReportTime;

/**
 * List of advertiser-defined custom conversion event metrics to include in the report
 * @type {!Array<!API.Client.CustomConversionEventMetrics>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.customConversionEventMetrics;

/**
 * Metric report end date (UTC). Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.endDate;

/**
 * Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
 * @type {!number}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.endHour;

/**
 * Number of days to use as the conversion attribution window for an engagement action.
 * @type {!API.Client.ConversionAttributionWindowDays}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.engagementWindowDays;

/**
 *   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
 * @type {!API.Client.Granularity}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.granularity;

/**
 * Level of the report
 * @type {!API.Client.MetricsReportingLevel}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.level;

/**
 * List of metrics filters
 * @type {!Array<!API.Client.AdsAnalyticsMetricsFilter>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.metricsFilters;

/**
 * @type {!API.Client.PrimarySort}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.primarySort;

/**
 * List of product group ids
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.productGroupIds;

/**
 * List of values for filtering
 * @type {!Array<!API.Client.ProductGroupSummaryStatus>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.productGroupStatuses;

/**
 * List of product item ids
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.productItemIds;

/**
 * @type {!API.Client.DataOutputFormat}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.reportFormat;

/**
 * Specify the timezone to be applied for the reporting.
 * @type {!API.Client.ReportingTimeZone}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.reportingTimezone;

/**
 * Metric report start date (UTC). Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.startDate;

/**
 * Which hour of the start date to begin the report. Only allowed for hourly reports.
 * @type {!number}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.startHour;

/**
 * List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
 * @type {!Array<!API.Client.AdAdsAnalyticsAsyncTargetingTypes>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.targetingTypes;

/**
 * Number of days to use as the conversion attribution window for a view action.
 * @type {!API.Client.ConversionAttributionWindowDays}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.viewWindowDays;

