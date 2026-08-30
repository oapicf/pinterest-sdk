import { ConversionAttributionWindowDays } from './conversion-attribution-window-days';
import { ConversionProductAttributionType } from './conversion-product-attribution-type';
import { ConversionReportTimeType } from './conversion-report-time-type';
import { ConversionProductReportGranularity } from './conversion-product-report-granularity';
import { ConversionProductReportLevel } from './conversion-product-report-level';
import { ConversionProductReportingColumn } from './conversion-product-reporting-column';
import { ConversionObjectiveType } from './conversion-objective-type';
import { ConversionProductReportBreakdownType } from './conversion-product-report-breakdown-type';


/**
 * Resource create operation model.
 */
export interface ConversionProductReportCreate { 
  /**
   *   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
   */
  ad_group_ids?: Array<string>;
  /**
   *   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
   */
  campaign_ids?: Array<string>;
  /**
   * List of values for filtering. Default is [\'CONSIDERATION\',\'AWARENESS\',\'WEB_CONVERSION\',\'VIDEO_COMPLETION\'].
   */
  campaign_objective_types?: Array<ConversionObjectiveType>;
  /**
   * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
   */
  click_window_days?: ConversionAttributionWindowDays;
  /**
   * Metric and entity columns
   */
  columns: Array<ConversionProductReportingColumn>;
  /**
   *   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
   */
  conversion_product_attribution_type?: ConversionProductAttributionType;
  /**
   * Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
   */
  conversion_product_breakdown?: ConversionProductReportBreakdownType;
  /**
   * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
   */
  conversion_report_time?: ConversionReportTimeType;
  /**
   *   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
   */
  end_date: string;
  /**
   * Report granularity for time-based metric aggregation
   */
  granularity: ConversionProductReportGranularity;
  /**
   * Level of the report
   */
  level: ConversionProductReportLevel;
  /**
   *   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
   */
  product_sku_ids?: Array<string>;
  /**
   * Name of the conversion product report
   */
  report_name: string;
  /**
   *   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
   */
  start_date: string;
  /**
   * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
   */
  view_window_days?: ConversionAttributionWindowDays;
}
export namespace ConversionProductReportCreate {
}


