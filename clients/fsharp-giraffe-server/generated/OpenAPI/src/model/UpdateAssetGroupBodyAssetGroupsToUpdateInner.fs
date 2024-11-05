namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetGroupType

module UpdateAssetGroupBodyAssetGroupsToUpdateInner =

  //#region UpdateAssetGroupBodyAssetGroupsToUpdateInner


  type UpdateAssetGroupBody_asset_groups_to_update_inner = {
    AssetGroupId : string;
    Name : string;
    Description : string;
    AssetGroupTypes : AssetGroupType[];
    AssetsToAdd : string[];
    AssetsToRemove : string[];
  }
  //#endregion
