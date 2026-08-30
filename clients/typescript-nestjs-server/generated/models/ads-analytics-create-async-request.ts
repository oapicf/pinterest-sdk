import { CampaignSummaryStatus } from './campaign-summary-status';
import { ReportingTimeZone } from './reporting-time-zone';
import { ConversionReportTimeType } from './conversion-report-time-type';
import { AdGroupSummaryStatus } from './ad-group-summary-status';
import { ProductGroupSummaryStatus } from './product-group-summary-status';
import { Granularity } from './granularity';
import { ConversionReportAttributionType } from './conversion-report-attribution-type';
import { AdAdsAnalyticsAsyncTargetingTypes } from './ad-ads-analytics-async-targeting-types';
import { ConversionAttributionWindowDays } from './conversion-attribution-window-days';
import { ReportingColumnAsync } from './reporting-column-async';
import { MetricsReportingLevel } from './metrics-reporting-level';
import { PrimarySort } from './primary-sort';
import { DataOutputFormat } from './data-output-format';
import { CampaignObjectiveType } from './campaign-objective-type';
import { CustomConversionEventMetrics } from './custom-conversion-event-metrics';
import { PinPromotionSummaryStatus } from './pin-promotion-summary-status';
import { AdsAnalyticsMetricsFilter } from './ads-analytics-metrics-filter';


export interface AdsAnalyticsCreateAsyncRequest { 
  /**
   * List of ad group ids
   */
  ad_group_ids?: Array<string>;
  /**
   * List of values for filtering
   */
  ad_group_statuses?: Array<AdGroupSummaryStatus>;
  /**
   * List of ad ids. This parameter is not supported for Product Item level reports.
   */
  ad_ids?: Array<string>;
  /**
   * List of values for filtering. This parameter is not supported for Product Item level reports.
   */
  ad_statuses?: Array<PinPromotionSummaryStatus>;
  /**
   * List of attribution types for the conversion report.
   */
  attribution_types?: Array<ConversionReportAttributionType>;
  /**
   * Campaign brand label for filtering.
   */
  campaign_brand_label?: string;
  /**
   * Campaign custom label for filtering.
   */
  campaign_custom_label?: string;
  /**
   * List of campaign ids
   */
  campaign_ids?: Array<string>;
  /**
   * List of values for filtering. [\"WEB_SESSIONS\"] is in BETA.
   */
  campaign_objective_types?: Array<CampaignObjectiveType>;
  /**
   * List of status values for filtering
   */
  campaign_statuses?: Array<CampaignSummaryStatus>;
  /**
   * Number of days to use as the conversion attribution window for a pin click action.
   */
  click_window_days?: ConversionAttributionWindowDays;
  /**
   * Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
   */
  columns?: Array<ReportingColumnAsync>;
  /**
   * Determines if the targeting types included in the request should be consolidated into a single breakdown.
   */
  combine_targeting_types?: boolean;
  /**
   * Date dimension for conversion metrics.
   */
  conversion_report_time?: ConversionReportTimeType;
  /**
   * List of advertiser-defined custom conversion event metrics to include in the report
   */
  custom_conversion_event_metrics?: Array<CustomConversionEventMetrics>;
  /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   */
  end_date: string;
  /**
   * Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
   */
  end_hour?: number;
  /**
   * Number of days to use as the conversion attribution window for an engagement action.
   */
  engagement_window_days?: ConversionAttributionWindowDays;
  /**
   *   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
   */
  granularity: Granularity;
  /**
   * Level of the report
   */
  level?: MetricsReportingLevel;
  /**
   * List of metrics filters
   */
  metrics_filters?: Array<AdsAnalyticsMetricsFilter>;
  primary_sort?: PrimarySort;
  /**
   * List of product group ids
   */
  product_group_ids?: Array<string>;
  /**
   * List of values for filtering
   */
  product_group_statuses?: Array<ProductGroupSummaryStatus>;
  /**
   * List of product item ids
   */
  product_item_ids?: Array<string>;
  report_format?: DataOutputFormat;
  /**
   * Specify the timezone to be applied for the reporting.
   */
  reporting_timezone?: ReportingTimeZone;
  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   */
  start_date: string;
  /**
   * Which hour of the start date to begin the report. Only allowed for hourly reports.
   */
  start_hour?: number;
  /**
   * List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
   */
  targeting_types?: Array<AdAdsAnalyticsAsyncTargetingTypes>;
  /**
   * Number of days to use as the conversion attribution window for a view action.
   */
  view_window_days?: ConversionAttributionWindowDays;
}
export namespace AdsAnalyticsCreateAsyncRequest {
}


