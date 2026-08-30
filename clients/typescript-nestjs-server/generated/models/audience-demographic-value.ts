

/**
 * Demographic detail for a single audience demographic
 */
export interface AudienceDemographicValue { 
  /**
   * Unique key for demographic item
   */
  key?: string;
  /**
   * Display name for demographic
   */
  name?: string;
  /**
   * Value of demographic item as a percent of total audience
   */
  ratio?: number;
}

