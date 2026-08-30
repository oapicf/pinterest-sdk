

/**
 * Object describing an item validation event
 */
export interface ItemValidationEvent { 
  /**
   * The attribute that the item validation event references
   */
  attribute?: string;
  /**
   * The event code that the item validation event references
   */
  code?: number;
  /**
   * Title message describing the item validation event
   */
  message?: string;
}

