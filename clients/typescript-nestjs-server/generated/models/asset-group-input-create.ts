import { AssetGroupType } from './asset-group-type';
import { AssetGroupBinding } from './asset-group-binding';


export interface AssetGroupInputCreate { 
  asset_group?: AssetGroupBinding;
  /**
   * Asset group description.
   */
  asset_group_description: string;
  /**
   * Asset Group name.
   */
  asset_group_name: string;
  /**
   * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
   */
  asset_group_types: Array<AssetGroupType>;
}

