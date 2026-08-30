import { AssetTypeResponse } from './asset-type-response';


/**
 * An object containing the permissions a business partner has on the asset.
 */
export interface UpdatePartnerAssetsResult { 
  /**
   * Unique identifier of a business asset.
   */
  asset_id?: string;
  asset_type?: AssetTypeResponse;
  /**
   * Unique identifier of a business partner.
   */
  partner_id?: string;
  /**
   * Permission levels member or partner has on an asset.
   */
  permissions?: Array<string>;
}
export namespace UpdatePartnerAssetsResult {
}


