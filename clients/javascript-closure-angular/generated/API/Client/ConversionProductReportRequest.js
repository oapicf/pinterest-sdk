goog.provide('API.Client.ConversionProductReportRequest');

/**
 * Request for a brand, category, SKU report
 * @record
 */
API.Client.ConversionProductReportRequest = function() {}

/**
 * List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionProductReportRequest.prototype.adGroupIds;

/**
 * List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionProductReportRequest.prototype.campaignIds;

/**
 * List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
 * @type {!Array<!API.Client.ObjectiveType>}
 * @export
 */
API.Client.ConversionProductReportRequest.prototype.campaignObjectiveTypes;

/**
 * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * @type {!API.Client.ConversionAttributionWindowDays}
 * @export
 */
API.Client.ConversionProductReportRequest.prototype.clickWindowDays;

/**
 * Metric and entity columns
 * @type {!Array<!API.Client.ConversionProductReportingColumn>}
 * @export
 */
API.Client.ConversionProductReportRequest.prototype.columns;

/**
 * @type {!string}
 * @export
 */
API.Client.ConversionProductReportRequest.prototype.conversionProductAttributionType;

/**
 * @type {!string}
 * @export
 */
API.Client.ConversionProductReportRequest.prototype.conversionProductBreakdown;

/**
 * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * @type {!API.Client.ConversionReportTimeType}
 * @export
 */
API.Client.ConversionProductReportRequest.prototype.conversionReportTime;

/**
 * Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.
 * @type {!string}
 * @export
 */
API.Client.ConversionProductReportRequest.prototype.endDate;

/**
 * TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
 * @type {!string}
 * @export
 */
API.Client.ConversionProductReportRequest.prototype.granularity;

/**
 * Level of the report
 * @type {!string}
 * @export
 */
API.Client.ConversionProductReportRequest.prototype.level;

/**
 * List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionProductReportRequest.prototype.productSkuIds;

/**
 * Name of the conversion product report.
 * @type {!string}
 * @export
 */
API.Client.ConversionProductReportRequest.prototype.reportName;

/**
 * Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.
 * @type {!string}
 * @export
 */
API.Client.ConversionProductReportRequest.prototype.startDate;

/**
 * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.
 * @type {!API.Client.ConversionAttributionWindowDays}
 * @export
 */
API.Client.ConversionProductReportRequest.prototype.viewWindowDays;

/** @enum {string} */
API.Client.ConversionProductReportRequest.ConversionProductAttributionTypeEnum = { 
  DEFAULT: 'DEFAULT',
  BRAND_ATTRIBUTION: 'BRAND_ATTRIBUTION',
}
/** @enum {string} */
API.Client.ConversionProductReportRequest.ConversionProductBreakdownEnum = { 
  PRODUCT_BRAND: 'PRODUCT_BRAND',
  PRODUCT_CATEGORY: 'PRODUCT_CATEGORY',
  PRODUCT_BRAND_AND_CATEGORY: 'PRODUCT_BRAND_AND_CATEGORY',
  PRODUCT_SKU: 'PRODUCT_SKU',
  PRODUCT_SKU_GROUP: 'PRODUCT_SKU_GROUP',
}
/** @enum {string} */
API.Client.ConversionProductReportRequest.GranularityEnum = { 
  WEEK: 'WEEK',
  MONTH: 'MONTH',
  TOTAL: 'TOTAL',
}
/** @enum {string} */
API.Client.ConversionProductReportRequest.LevelEnum = { 
  ADVERTISER: 'ADVERTISER',
  CAMPAIGN: 'CAMPAIGN',
  AD_GROUP: 'AD_GROUP',
}
