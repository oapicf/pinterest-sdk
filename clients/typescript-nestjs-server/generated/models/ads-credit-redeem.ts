

/**
 * Ads credit redemption
 */
export interface AdsCreditRedeem { 
  /**
   * Error code type if error occurs
   */
  readonly errorCode?: number | null;
  /**
   * Reason for failure
   */
  readonly errorMessage?: string | null;
  /**
   * Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
   */
  readonly success?: boolean;
}

