

export interface TargetingSpecShoppingRetargeting { 
  /**
   * Number of days ago to stop lookback timeframe for dynamic retargeting
   */
  exclusion_window?: number;
  /**
   * Number of days ago to start lookback timeframe for dynamic retargeting
   */
  lookback_window?: number;
  /**
   * Event types to target for dynamic retargeting
   */
  tag_types?: Array<number>;
}

