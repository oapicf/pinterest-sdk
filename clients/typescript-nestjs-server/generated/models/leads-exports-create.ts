

/**
 * Resource create operation model.
 */
export interface LeadsExportsCreate { 
  /**
   * ID for the ad collecting leads.
   */
  ad_id: string;
  /**
   * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
   */
  end_date: string;
  /**
   * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
   */
  start_date: string;
}

