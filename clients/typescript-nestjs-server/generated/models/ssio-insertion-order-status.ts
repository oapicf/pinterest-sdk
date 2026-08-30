

/**
 * SSIO insertion order status item in a list response.
 */
export interface SSIOInsertionOrderStatus { 
  /**
   * Salesforce insertion order creation time
   */
  creation_time?: string | null;
  /**
   * Salesforce order id
   */
  pin_order_id?: string;
  /**
   * Salesforce insertion order status
   */
  status?: string;
}

