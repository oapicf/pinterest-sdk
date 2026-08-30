import { SSIOAccountAddress } from './ssio-account-address';


/**
 * Salesforce account item with billing and terms information.
 */
export interface SSIOAccountItem { 
  /**
   * Address information that is associated with this account.
   */
  addresses?: Array<SSIOAccountAddress>;
  /**
   * Salesforce id for billto_info
   */
  id?: string;
  /**
   * Salesforce text for IO Terms and Conditions
   */
  io_terms?: string;
  /**
   * Salesforce id for IO Terms and Conditions
   */
  io_terms_id?: string;
  /**
   * Insertion Order Type - Pinterest Paper or Agency Paper
   */
  io_type?: string;
  /**
   * Salesforce text for Rest of the World Terms and Conditions
   */
  row_terms?: string;
  /**
   * Salesforce id for Rest of the World Terms and Conditions
   */
  row_terms_id?: string;
  /**
   * Salesforce text for US Terms and Conditions
   */
  us_terms?: string;
  /**
   * Salesforce id for US Terms and Conditions
   */
  us_terms_id?: string;
}

