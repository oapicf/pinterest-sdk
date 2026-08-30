import { DeletePartnerAssetAccessItem } from './delete-partner-asset-access-item';


/**
 * An object with a list of partner asset accesses to delete.
 */
export interface DeletePartnerAssetAccessBody { 
  /**
   * List of partner asset accesses to delete.
   */
  accesses: Array<DeletePartnerAssetAccessItem>;
}

