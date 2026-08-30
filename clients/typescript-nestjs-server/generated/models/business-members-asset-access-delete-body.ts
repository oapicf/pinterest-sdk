import { DeleteMemberAssetAccessItem } from './delete-member-asset-access-item';


/**
 * An object with a list of member asset accesses to delete.
 */
export interface BusinessMembersAssetAccessDeleteBody { 
  /**
   * List of members asset access to be deleted
   */
  accesses: Array<DeleteMemberAssetAccessItem>;
}

