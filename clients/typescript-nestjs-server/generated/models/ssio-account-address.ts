

/**
 * Salesforce address information.
 */
export interface SSIOAccountAddress { 
  /**
   * Salesforce id for address
   */
  address_id?: string;
  /**
   * Address display
   */
  display?: string;
  /**
   * Legal entity for this insertion order
   */
  order_legal_entity?: string;
  /**
   * Purpose for which the address is used, usually Billing or Businness
   */
  purpose?: string;
}

