

/**
 * SSIO insertion order status response for a single pin order id lookup.
 */
export interface SSIOInsertionOrderStatusResponse { 
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

