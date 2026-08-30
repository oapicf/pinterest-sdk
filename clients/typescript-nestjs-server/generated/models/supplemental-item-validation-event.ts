

/**
 * Item validation event
 */
export interface SupplementalItemValidationEvent { 
  /**
   * The item attribute referenced by the validation event eg. price, availability, ad_link
   */
  attribute: string;
  /**
   * The event code that the item validation event references
   */
  code: number;
  /**
   * Title message describing the item validation event
   */
  message: string;
}

