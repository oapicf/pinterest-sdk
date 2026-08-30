

export interface IntegrationLogsInvalidLogResponseRejectedLogsItems { 
  /**
   * The field name containing an invalid value.
   */
  field: string;
  /**
   * Index of the log in the batch.
   */
  log_index?: number;
  /**
   * The reason the value is invalid.
   */
  reason: string;
  /**
   * The value that is invalid.
   */
  value: string;
}

