import { AdAccountsAudienceRule } from './ad-accounts-audience-rule';
import { AudienceType } from './audience-type';


/**
 * Resource create operation model.
 */
export interface AdAccountsAudienceCreate { 
  /**
   * Ad account ID.
   */
  ad_account_id?: string;
  /**
   * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
   */
  audience_type?: AudienceType;
  /**
   * Audience description.
   */
  description?: string | null;
  /**
   * Audience name.
   */
  name?: string;
  rule?: AdAccountsAudienceRule;
}
export namespace AdAccountsAudienceCreate {
}


