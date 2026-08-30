namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetGroupBinding
open OpenAPI.Model.AssetGroupUpdateError
open OpenAPI.Model.AssetGroupUpdateItemReadOrUpdateItem

module AssetGroupModificationReadOrUpdate =

  //#region AssetGroupModificationReadOrUpdate


  type AssetGroupModificationReadOrUpdate = {
    AssetGroupsToUpdate : AssetGroupUpdateItemReadOrUpdateItem[];
    Exceptions : AssetGroupUpdateError[];
    UpdatedAssetGroups : AssetGroupBinding[];
  }
  //#endregion
