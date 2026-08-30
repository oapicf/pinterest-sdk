

export interface ProductGroupAnalyticsItems { 
  /**
   * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
   */
  DATE?: string;
  /**
   * The ID of the product group that this metrics belongs to.
   */
  PRODUCT_GROUP_ID: string;
}

