import { AssetGroupDeleteError } from './asset-group-delete-error';


export interface AssetGroupDeletion { 
  readonly deleted_asset_groups?: Array<string>;
  exceptions?: Array<AssetGroupDeleteError> | null;
}

