import { Role } from './role';


export interface AdAccountToAdAccountSharedAudience { 
  /**
   * Unique identifier of an audience
   */
  audience_id: string;
  /**
   * Permissions granted to the recipients.
   */
  readonly permissions?: Array<Role>;
  /**
   * Ad account IDs to share with or revoke from (request) / that received the audience (response).
   */
  recipient_account_ids: Array<string>;
}

