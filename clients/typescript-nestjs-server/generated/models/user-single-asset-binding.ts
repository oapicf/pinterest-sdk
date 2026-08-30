import { BusinessAccessUserSummary } from './business-access-user-summary';


/**
 * An object containing the permissions a business member/partner has on the asset.
 */
export interface UserSingleAssetBinding { 
  /**
   * Permission levels member or partner has on an asset.
   */
  permissions?: Array<string>;
  user?: BusinessAccessUserSummary;
}

