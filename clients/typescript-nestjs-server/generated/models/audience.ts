import { AudienceStatus } from './audience-status';
import { PinnerListType } from './pinner-list-type';
import { AudienceRule } from './audience-rule';


export interface Audience { 
  /**
   * Ad account ID.
   */
  ad_account_id?: string;
  /**
   * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
   */
  audience_type?: PinnerListType;
  /**
   * The company that created this audience.
   */
  created_by_company_name?: string | null;
  /**
   * Creation time. Unix timestamp in seconds.
   */
  created_timestamp?: number | null;
  /**
   * Audience description.
   */
  description?: string | null;
  /**
   * Audience ID.
   */
  id?: string;
  /**
   * Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
   */
  is_nca?: boolean;
  /**
   * Audience name.
   */
  name?: string;
  rule?: AudienceRule;
  /**
   * Audience size.
   */
  size?: number | null;
  /**
   * Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
   */
  status?: AudienceStatus;
  /**
   * Always \"audience\".
   */
  type?: string;
  /**
   * Last update time. Unix timestamp in seconds.
   */
  updated_timestamp?: number | null;
}
export namespace Audience {
}


