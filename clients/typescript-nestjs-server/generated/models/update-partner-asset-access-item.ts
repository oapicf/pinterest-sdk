import { Permissions } from './permissions';


export interface UpdatePartnerAssetAccessItem { 
  /**
   * Unique identifier of the business asset.
   */
  asset_id: string;
  /**
   * Unique identifier of a business partner to update asset access to.
   */
  partner_id: string;
  /**
   * A non-empty array of permissions to assign to the partner.
   */
  permissions: Array<Permissions>;
}

