import { UpdateMemberAssetAccessItem } from './update-member-asset-access-item';


/**
 * An object with a list of all the new member asset accesses.
 */
export interface UpdateMemberAssetAccessBody { 
  /**
   * List of member asset accesses to assign or update.
   */
  accesses: Array<UpdateMemberAssetAccessItem>;
}

