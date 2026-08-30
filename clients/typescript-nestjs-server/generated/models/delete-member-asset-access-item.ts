

export interface DeleteMemberAssetAccessItem { 
  /**
   * Id of the asset on which to remove member permissions.
   */
  asset_id: string;
  /**
   * Unique identifier of the member on which to perform the asset permission removal
   */
  member_id: string;
}

