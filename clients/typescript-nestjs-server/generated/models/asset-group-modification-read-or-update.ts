import { AssetGroupUpdateError } from './asset-group-update-error';
import { AssetGroupUpdateItemReadOrUpdateItem } from './asset-group-update-item-read-or-update-item';
import { AssetGroupBinding } from './asset-group-binding';


export interface AssetGroupModificationReadOrUpdate { 
  /**
   * A list of asset groups and the data that will be used to update them.
   */
  asset_groups_to_update?: Array<AssetGroupUpdateItemReadOrUpdateItem>;
  /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   */
  readonly exceptions?: Array<AssetGroupUpdateError>;
  /**
   * A list of successfully edited asset groups.
   */
  readonly updated_asset_groups?: Array<AssetGroupBinding>;
}

