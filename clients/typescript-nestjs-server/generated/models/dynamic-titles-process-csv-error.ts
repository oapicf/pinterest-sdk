

export interface DynamicTitlesProcessCSVError { 
  /**
   * The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
   */
  error_type?: string;
  /**
   * The row number with a validation error. -1 indicates a file-level error.
   */
  row_number?: number;
}

