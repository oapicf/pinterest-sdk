

/**
 * Asset ID with permission levels.
 */
export interface AssetIdWithPermissions { 
  /**
   * Unique identifier of a business asset.
   */
  id?: string;
  /**
   * Permission levels member or partner has on an asset.
   */
  permissions?: Array<string>;
}

