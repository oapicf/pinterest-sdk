goog.provide('API.Client.AdsAnalyticsCreateAsyncRequest');

/**
 * @record
 */
API.Client.AdsAnalyticsCreateAsyncRequest = function() {}

/**
 * Metric report start date (UTC). Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.startDate;

/**
 * Metric report end date (UTC). Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.endDate;

/**
 * TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
 * @type {!API.Client.Granularity}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.granularity;

/**
 * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * @type {!API.Client.ConversionAttributionWindowDays}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.clickWindowDays;

/**
 * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * @type {!API.Client.ConversionAttributionWindowDays}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.engagementWindowDays;

/**
 * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
 * @type {!API.Client.ConversionAttributionWindowDays}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.viewWindowDays;

/**
 * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * @type {!API.Client.ConversionReportTimeType}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.conversionReportTime;

/**
 * List of types of attribution for the conversion report
 * @type {!Array<!API.Client.ConversionReportAttributionType>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.attributionTypes;

/**
 * List of campaign ids
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.campaignIds;

/**
 * List of status values for filtering
 * @type {!Array<!API.Client.CampaignSummaryStatus>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.campaignStatuses;

/**
 * List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
 * @type {!Array<!API.Client.ObjectiveType>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.campaignObjectiveTypes;

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
 * List of ad ids [This parameter is no supported for Product Item Level Reports]
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.adIds;

/**
 * List of values for filtering [This parameter is not supported for Product Item Level Reports]
 * @type {!Array<!API.Client.PinPromotionSummaryStatus>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.adStatuses;

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
 * List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
 * @type {!Array<!API.Client.AdsAnalyticsTargetingType>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.targetingTypes;

/**
 * List of metrics filters
 * @type {!Array<!API.Client.AdsAnalyticsMetricsFilter>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.metricsFilters;

/**
 * Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.
 * @type {!Array<!API.Client.ReportingColumnAsync>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.columns;

/**
 * Level of the report
 * @type {!API.Client.MetricsReportingLevel}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.level;

/**
 * Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.
 * @type {!API.Client.DataOutputFormat}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.reportFormat;

