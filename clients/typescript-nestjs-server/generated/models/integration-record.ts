

/**
 * Integration record
 */
export interface IntegrationRecord { 
  additional_id_1?: string | null;
  connected_advertiser_id?: string | null;
  connected_lba_id?: string | null;
  connected_merchant_id?: string | null;
  connected_tag_id?: string | null;
  connected_user_id?: string;
  created_time?: number;
  external_business_id?: string | null;
  /**
   * Integration record ID.
   */
  readonly id: string;
  partner_access_token?: string | null;
  partner_access_token_expiry?: number | null;
  partner_metadata?: string | null;
  partner_primary_email?: string | null;
  partner_refresh_token?: string | null;
  partner_refresh_token_expiry?: number | null;
  scopes?: string | null;
  updated_time?: number;
}

