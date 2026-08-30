import { AssetIdWithPermissions } from './asset-id-with-permissions';


/**
 * Ad accounts and profiles the business member/partner has access to.
 */
export interface BusinessMemberAssetsSummary { 
  /**
   * List of ad account IDs and respective permission levels.
   */
  ad_accounts?: Array<AssetIdWithPermissions>;
  /**
   * List of profile IDs and respective permission levels.
   */
  profiles?: Array<AssetIdWithPermissions>;
}

