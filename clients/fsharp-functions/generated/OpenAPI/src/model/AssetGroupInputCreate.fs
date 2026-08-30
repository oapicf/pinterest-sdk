namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssetGroupBinding
open OpenAPI.Model.AssetGroupType

module AssetGroupInputCreate =

  //#region AssetGroupInputCreate

  [<CLIMutable>]
  type AssetGroupInputCreate = {
    [<JsonProperty(PropertyName = "asset_group")>]
    AssetGroup : AssetGroupBinding;
    [<JsonProperty(PropertyName = "asset_group_description")>]
    AssetGroupDescription : string;
    [<JsonProperty(PropertyName = "asset_group_name")>]
    AssetGroupName : string;
    [<JsonProperty(PropertyName = "asset_group_types")>]
    AssetGroupTypes : AssetGroupType[];
  }

  //#endregion
