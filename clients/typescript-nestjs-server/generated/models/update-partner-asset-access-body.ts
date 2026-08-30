import { UpdatePartnerAssetAccessItem } from './update-partner-asset-access-item';


/**
 * An object with a list of partner asset accesses to assign or update.
 */
export interface UpdatePartnerAssetAccessBody { 
  /**
   * List of partner asset accesses to assign or update.
   */
  accesses: Array<UpdatePartnerAssetAccessItem>;
}

