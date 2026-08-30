

/**
 * The ID of the ad account.
 */
export interface TermsOfService { 
  /**
   * The ID of the ad account.
   */
  ad_account_id?: string;
  /**
   * Whether the ad account has accepted terms of service.
   */
  has_accepted?: boolean;
  /**
   * The terms of service content
   */
  html?: string | null;
  /**
   * The ID of the terms of service
   */
  id?: string;
}

