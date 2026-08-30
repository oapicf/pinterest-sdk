import { SSIOOrderLineType } from './ssio-order-line-type';
import { Currency } from './currency';


/**
 * Resource create operation model.
 */
export interface SSIOInsertionOrderCreate { 
  /**
   * The SFDC id for the terms
   */
  accepted_terms_id: string;
  /**
   * The UTC timestamp (to the nearest sec) of when terms were accepted
   */
  accepted_terms_time?: number;
  /**
   * URL link for agency
   */
  agency_link?: string;
  /**
   * The billing contact email
   */
  billing_contact_email: string;
  /**
   * The billing contact first name
   */
  billing_contact_firstname: string;
  /**
   * The billing contact last name
   */
  billing_contact_lastname: string;
  /**
   * The bill-to billing address id
   */
  billto_billing_address_id: string;
  /**
   * The bill-to business address id
   */
  billto_business_address_id: string;
  /**
   * The bill-to company id
   */
  billto_company_id: string;
  /**
   * If Budget order line, the budget amount.
   */
  budget_amount?: number;
  currency_info: Currency;
  /**
   * End date of time period. Format: YYYY-MM-DD
   */
  end_date?: string;
  /**
   * If Ongoing (perpetual) order line, the estimated monthly spend
   */
  estimated_monthly_spend?: number;
  /**
   * The media contact email
   */
  media_contact_email: string;
  /**
   * The media contact first name
   */
  media_contact_firstname: string;
  /**
   * The media contact last name
   */
  media_contact_lastname: string;
  /**
   * Type can be Budget or Perpetual
   */
  order_line_type: SSIOOrderLineType;
  /**
   * The order name
   */
  order_name: string;
  /**
   * The pmp id
   */
  pmp_id: string;
  /**
   * The po number
   */
  po_number: string;
  /**
   * Starting date of time period. Format: YYYY-MM-DD
   */
  start_date: string;
  /**
   * The email of user submitting the insertion order
   */
  user_email?: string;
}
export namespace SSIOInsertionOrderCreate {
}


