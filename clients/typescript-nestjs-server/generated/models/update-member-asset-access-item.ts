import { Permissions } from './permissions';


export interface UpdateMemberAssetAccessItem { 
  /**
   * Id of the asset to update.
   */
  asset_id: string;
  /**
   * Unique identifier of the member on which to perform the update
   */
  member_id: string;
  /**
   * A non-empty array of permissions to assign to the member.
   */
  permissions: Array<Permissions>;
}

