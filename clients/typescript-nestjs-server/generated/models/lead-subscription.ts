

export interface LeadSubscription { 
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
}

