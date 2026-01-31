goog.provide('API.Client.AdsAnalyticsCreateAsyncRequest');

/**
 * @record
 */
API.Client.AdsAnalyticsCreateAsyncRequest = function() {}

/**
 * List of types of attribution for the conversion report
 * @type {!Array<!API.Client.ConversionReportAttributionType>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.attributionTypes;

/**
 * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * @type {!API.Client.ConversionAttributionWindowDays}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.clickWindowDays;

/**
 * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * @type {!API.Client.ConversionReportTimeType}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.conversionReportTime;

/**
 * Metric report end date (UTC). Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.endDate;

/**
 * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * @type {!API.Client.ConversionAttributionWindowDays}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.engagementWindowDays;

/**
 * TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
 * @type {!API.Client.Granularity}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.granularity;

/**
 * Metric report start date (UTC). Format: YYYY-MM-DD
 * @type {!string}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.startDate;

/**
 * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
 * @type {!API.Client.ConversionAttributionWindowDays}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.viewWindowDays;

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
 * Campaign brand label for filtering.
 * @type {!string}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.campaignBrandLabel;

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
 * List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
 * @type {!Array<!string>}
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
 * Determines if the targeting types included in the request should be consolidated into a single breakdown. For example, when combine_targeting_types is set to true, if GENDER and COUNTRY are targeting types in the request, the response will have a targeting type of GENDER_AND_COUNTRY and targeting values such as female&US. This feature is currently in BETA and is not available to all users.
 * @type {!boolean}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.combineTargetingTypes;

/**
 * List of advertiser-defined custom conversion event metrics to include in the report
 * @type {!Array<!API.Client.AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics>}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.customConversionEventMetrics;

/**
 * Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports.
 * @type {!number}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.endHour;

/**
 * Level of the report
 * @type {!API.Client.MetricsReportingLevel}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.level;

/**
 * Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.
 * @type {!string}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.primarySort;

/**
 * Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.
 * @type {!API.Client.DataOutputFormat}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.reportFormat;

/**
 * Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
 * @type {!API.Client.ReportingTimeZone}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.reportingTimezone;

/**
 * Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports.
 * @type {!number}
 * @export
 */
API.Client.AdsAnalyticsCreateAsyncRequest.prototype.startHour;

/** @enum {string} */
API.Client.AdsAnalyticsCreateAsyncRequest.Array&lt;!TargetingTypesEnum&gt; = { 
  KEYWORD: 'KEYWORD',
  APPTYPE: 'APPTYPE',
  GENDER: 'GENDER',
  LOCATION: 'LOCATION',
  PLACEMENT: 'PLACEMENT',
  COUNTRY: 'COUNTRY',
  TARGETED_INTEREST: 'TARGETED_INTEREST',
  PINNER_INTEREST: 'PINNER_INTEREST',
  AUDIENCE_INCLUDE: 'AUDIENCE_INCLUDE',
  GEO: 'GEO',
  AGE_BUCKET: 'AGE_BUCKET',
  REGION: 'REGION',
  MEDIA_TYPE: 'MEDIA_TYPE',
  AGE_BUCKET_AND_GENDER: 'AGE_BUCKET_AND_GENDER',
  AUDIENCE_MULTIPLIER: 'AUDIENCE_MULTIPLIER',
  CREATIVE_ENHANCEMENTS: 'CREATIVE_ENHANCEMENTS',
  LOCAL_ADS_STORE_CODE: 'LOCAL_ADS_STORE_CODE',
}
/** @enum {string} */
API.Client.AdsAnalyticsCreateAsyncRequest.PrimarySortEnum = { 
  BY_ID: 'BY_ID',
  BY_DATE: 'BY_DATE',
}
