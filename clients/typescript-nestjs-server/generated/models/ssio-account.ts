import { SSIOAccountItem } from './ssio-account-item';
import { SSIOAccountPMPName } from './ssio-account-pmp-name';


/**
 * Salesforce account details including bill-to information.
 */
export interface SSIOAccount { 
  /**
   * An array of Salesforce account information that includes address, io terms, etc.
   */
  billto_infos?: Array<SSIOAccountItem>;
  /**
   * Advertiser eligible to update order lines
   */
  can_edit?: boolean;
  currency?: string;
  /**
   * Advertiser eligible to create order lines
   */
  eligible?: boolean;
  /**
   * Error indicator from Salesforce which could be \"No Error\"
   */
  error?: string;
  pmp_names?: Array<SSIOAccountPMPName>;
}

