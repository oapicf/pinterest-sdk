

export interface UserWebsite { 
  /**
   * Status of the verification process
   */
  readonly status?: string;
  /**
   * UTC timestamp when the verification happened - sometimes missing
   */
  readonly verified_at?: string;
  /**
   * Website with path or domain only
   */
  website?: string;
}

