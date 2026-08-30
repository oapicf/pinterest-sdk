import { AssetGroupUpdateError } from './asset-group-update-error';
import { AssetGroupBinding } from './asset-group-binding';


export interface AssetGroupModification { 
  /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   */
  readonly exceptions?: Array<AssetGroupUpdateError>;
  /**
   * A list of successfully edited asset groups.
   */
  readonly updated_asset_groups?: Array<AssetGroupBinding>;
}

