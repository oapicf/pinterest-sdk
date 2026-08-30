

/**
 * Resource create or update operation model.
 */
export interface SSIOInsertionOrderUpdate { 
  /**
   * Ads manager OrderLineId
   */
  ads_manager_order_line_id?: string;
  /**
   * URL link for agency
   */
  agency_link?: string;
  /**
   * The billing contact email
   */
  billing_contact_email?: string;
  /**
   * The billing contact first name
   */
  billing_contact_firstname?: string;
  /**
   * The billing contact last name
   */
  billing_contact_lastname?: string;
  /**
   * If Budget order line, the budget amount.
   */
  budget_amount?: number;
  /**
   * End date of time period. Format: YYYY-MM-DD
   */
  end_date?: string;
  /**
   * The media contact email
   */
  media_contact_email?: string;
  /**
   * The media contact first name
   */
  media_contact_firstname?: string;
  /**
   * The media contact last name
   */
  media_contact_lastname?: string;
  /**
   * LineId in the Oracle DB
   */
  oracle_line_id?: string;
  /**
   * The po number
   */
  po_number?: string;
  /**
   * OrderId in SFDC
   */
  salesforce_order_id?: string;
  /**
   * OrderLineId in SFDC
   */
  salesforce_order_line_id?: string;
  /**
   * Starting date of time period. Format: YYYY-MM-DD
   */
  start_date?: string;
  /**
   * The email of user submitting the insertion order
   */
  user_email?: string;
}

