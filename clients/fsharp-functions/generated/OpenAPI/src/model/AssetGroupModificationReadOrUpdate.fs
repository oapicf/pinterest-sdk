namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssetGroupBinding
open OpenAPI.Model.AssetGroupUpdateError
open OpenAPI.Model.AssetGroupUpdateItemReadOrUpdateItem

module AssetGroupModificationReadOrUpdate =

  //#region AssetGroupModificationReadOrUpdate

  [<CLIMutable>]
  type AssetGroupModificationReadOrUpdate = {
    [<JsonProperty(PropertyName = "asset_groups_to_update")>]
    AssetGroupsToUpdate : AssetGroupUpdateItemReadOrUpdateItem[];
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : AssetGroupUpdateError[];
    [<JsonProperty(PropertyName = "updated_asset_groups")>]
    UpdatedAssetGroups : AssetGroupBinding[];
  }

  //#endregion
