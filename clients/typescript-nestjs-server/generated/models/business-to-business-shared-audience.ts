import { Role } from './role';


export interface BusinessToBusinessSharedAudience { 
  /**
   * Unique identifier of an audience
   */
  audience_id: string;
  /**
   * Permissions granted to the recipients.
   */
  readonly permissions?: Array<Role>;
  /**
   * Business IDs to share with or revoke from (request) / that received the audience (response).
   */
  recipient_business_ids: Array<string>;
}

