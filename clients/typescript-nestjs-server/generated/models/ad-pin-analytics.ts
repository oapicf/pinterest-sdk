

export interface AdPinAnalytics { 
  /**
   * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
   */
  DATE?: string;
  /**
   * The ID of the pin that the metric belongs to.
   */
  PIN_ID: string;
}

