

export interface AdGroupsAnalyticsMetrics { 
  /**
   * The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
   */
  AD_GROUP_ID?: string;
  /**
   * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
   */
  DATE?: string;
}

