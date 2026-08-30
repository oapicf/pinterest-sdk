

/**
 * An object containing the permissions a business member has on the asset.
 */
export interface UsersForIndividualAssetResponse { 
  /**
   * Unique identifier of a business asset.
   */
  asset_id?: string;
  /**
   * Unique identifier of the business member with asset access.
   */
  member_id?: string;
  /**
   * Permission levels member or partner has on an asset.
   */
  permissions?: Array<string>;
}

