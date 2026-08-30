

/**
 * Integration metadata
 */
export interface IntegrationMetadata { 
  additional_id_1?: string;
  connected_advertiser_id?: string;
  connected_lba_id?: string;
  connected_merchant_id?: string;
  connected_tag_id?: string;
  readonly connected_user_id?: string;
  readonly created_timestamp?: number;
  /**
   * External business ID for the integration.
   */
  external_business_id?: string;
  readonly id?: string;
  partner_access_token_expiry?: number;
  partner_metadata?: string;
  partner_refresh_token_expiry?: number;
  scopes?: string;
  readonly updated_timestamp?: number;
}

