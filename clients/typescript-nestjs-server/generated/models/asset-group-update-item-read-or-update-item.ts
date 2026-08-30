import { AssetGroupType } from './asset-group-type';


export interface AssetGroupUpdateItemReadOrUpdateItem { 
  /**
   * Unique identifier of the asset group to update.
   */
  asset_group_id: string;
  /**
   * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
   */
  asset_group_types?: Array<AssetGroupType>;
  /**
   * A list of asset ids to add to the asset group.
   */
  assets_to_add?: Array<string>;
  /**
   * A list of asset ids to remove from the asset group.
   */
  assets_to_remove?: Array<string>;
  /**
   * Asset group description.
   */
  description?: string;
  /**
   * Asset Group name.
   */
  name?: string;
}

