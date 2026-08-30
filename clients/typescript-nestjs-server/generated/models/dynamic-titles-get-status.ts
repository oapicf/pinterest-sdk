

export interface DynamicTitlesGetStatus { 
  /**
   * The count of generated titles.
   */
  generated_count?: number;
  /**
   * Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
   */
  is_ready?: boolean;
  /**
   * The count of advertiser reviewed titles.
   */
  reviewed_count?: number;
}

