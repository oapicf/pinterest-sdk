import { PartnerMetadata } from './partner-metadata';


export interface LeadSubscriptionPostParams { 
  /**
   * The Ad Account ID that this lead form belongs to.
   */
  ad_account_id?: string;
  /**
   * API version.
   */
  api_version?: string;
  /**
   * Subscription creation time. Unix timestamp in milliseconds.
   */
  created_time?: number;
  /**
   * Lead data encryption algorithm.
   */
  cryptographic_algorithm?: string | null;
  /**
   * Base64 encoded key for client to decrypt lead data.
   */
  cryptographic_key?: string | null;
  /**
   * Subscription ID.
   */
  id?: string;
  /**
   * Lead form ID.
   */
  lead_form_id?: string | null;
  /**
   * User account used to subscribe lead data.
   */
  user_account_id?: string;
  /**
   * Standard HTTPS webhook URL.
   */
  webhook_url?: string;
  /**
   * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
   */
  partner_access_token?: string;
  /**
   * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
   */
  partner_metadata?: PartnerMetadata;
  /**
   * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
   */
  partner_refresh_token?: string;
}

