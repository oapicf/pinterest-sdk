

/**
 * The terminated asset access.
 */
export interface DeletePartnerAssetAccessResult { 
  /**
   * Unique identifier of a business asset.
   */
  asset_id?: string;
  /**
   * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
   */
  asset_type?: string;
  /**
   * If is_shared_partner=FALSE, you terminated a partner\'s asset access to your business asset. If is_shared_partner=TRUE, you terminated your asset access to your partner\'s business asset.
   */
  is_shared_partner?: boolean;
  /**
   * Unique identifier of a business partner.
   */
  partner_id?: string;
  /**
   * Permission levels member or partner has on an asset.
   */
  permissions?: Array<string>;
}

