import { CatalogBinding } from './catalog-binding';
import { AssetTypeResponse } from './asset-type-response';
import { AssetGroupBinding } from './asset-group-binding';


export interface BusinessAssets { 
  /**
   * An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals \'ASSET_GROUP\'.
   */
  asset_group_info?: AssetGroupBinding;
  /**
   * Unique identifier of a business asset.
   */
  asset_id?: string;
  asset_type?: AssetTypeResponse;
  /**
   * Permission levels the requesting business has on an asset.
   */
  permissions?: Array<string>;
  /**
   * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals \'CATALOG\'.
   */
  catalog_info?: CatalogBinding;
}
export namespace BusinessAssets {
}


