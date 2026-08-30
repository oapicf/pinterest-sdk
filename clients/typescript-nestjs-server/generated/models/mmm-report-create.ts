import { MMMReportLevel } from './mmm-report-level';
import { MMMReportingTargetingType } from './mmm-reporting-targeting-type';
import { MMMReportingColumn } from './mmm-reporting-column';
import { MMMReportGranularity } from './mmm-report-granularity';
import { TargetingAdvertiserCountry } from './targeting-advertiser-country';


/**
 * Resource create operation model.
 */
export interface MMMReportCreate { 
  /**
   * Advertiser IDs for multi-advertiser report
   */
  advertiser_ids?: Array<string>;
  /**
   * Metric and entity columns
   */
  columns: Array<MMMReportingColumn>;
  /**
   * A List of countries for filtering
   */
  countries?: Array<TargetingAdvertiserCountry>;
  /**
   * List of custom column IDs
   */
  custom_column_ids?: Array<string>;
  /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   */
  end_date: string;
  /**
   *   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
   */
  granularity: MMMReportGranularity;
  /**
   * Level of the report
   */
  level: MMMReportLevel;
  /**
   * Name of the Marketing Mix Modeling (MMM) report
   */
  report_name: string;
  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   */
  start_date: string;
  /**
   * List of targeting types
   */
  targeting_types: Array<MMMReportingTargetingType>;
}
export namespace MMMReportCreate {
}


