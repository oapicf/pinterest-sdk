namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssetGroupType

module AssetGroupUpdateItemReadOrUpdateItem =

  //#region AssetGroupUpdateItemReadOrUpdateItem

  [<CLIMutable>]
  type AssetGroupUpdateItemReadOrUpdateItem = {
    [<JsonProperty(PropertyName = "asset_group_id")>]
    AssetGroupId : string;
    [<JsonProperty(PropertyName = "asset_group_types")>]
    AssetGroupTypes : AssetGroupType[];
    [<JsonProperty(PropertyName = "assets_to_add")>]
    AssetsToAdd : string[];
    [<JsonProperty(PropertyName = "assets_to_remove")>]
    AssetsToRemove : string[];
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
