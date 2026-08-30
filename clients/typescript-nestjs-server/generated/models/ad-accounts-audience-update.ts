import { AdAccountsAudienceRule } from './ad-accounts-audience-rule';
import { AudienceType } from './audience-type';
import { AudienceUpdateOperationType } from './audience-update-operation-type';


/**
 * Resource create or update operation model.
 */
export interface AdAccountsAudienceUpdate { 
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
  /**
   * Audience operation type (update or remove). Only valid in update request body.
   */
  operation_type?: AudienceUpdateOperationType;
  rule?: AdAccountsAudienceRule;
}
export namespace AdAccountsAudienceUpdate {
}


