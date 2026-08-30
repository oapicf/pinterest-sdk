

/**
 * Resource create operation model.
 */
export interface IntegrationMetadataCreate { 
  additional_id_1?: string;
  connected_advertiser_id?: string;
  connected_lba_id?: string;
  connected_merchant_id?: string;
  connected_tag_id?: string;
  /**
   * External business ID for the integration.
   */
  external_business_id?: string;
  partner_access_token?: string;
  partner_access_token_expiry?: number;
  partner_metadata?: string;
  partner_primary_email?: string;
  partner_refresh_token?: string;
  partner_refresh_token_expiry?: number;
  scopes?: string;
}

