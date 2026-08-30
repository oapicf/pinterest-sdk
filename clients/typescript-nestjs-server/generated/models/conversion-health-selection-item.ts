

/**
 * User selection of conversion health criteria for a single feature
 */
export interface ConversionHealthSelectionItem { 
  /**
   * Status for conversion types
   */
  conversionType?: object;
  /**
   * Status for criteria
   */
  criteria?: object;
  /**
   * Status for ingestion sources
   */
  ingestionSource?: object;
  /**
   * Overall status for this selection item
   */
  status: any | null;
}

