

/**
 * Related Keyword information of the editorial article
 */
export interface KeywordInfo { 
  /**
   * Keyword Name
   */
  name: string;
  /**
   * MoM growth as a percentage, if there is no growth rate, this field is not present
   */
  pct_growth_mom?: number;
}

