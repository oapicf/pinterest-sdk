namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssetGroupBinding
open OpenAPI.Model.AssetTypeResponse

module BaseBusinessAssets =

  //#region BaseBusinessAssets

  [<CLIMutable>]
  type BaseBusinessAssets = {
    [<JsonProperty(PropertyName = "asset_group_info")>]
    AssetGroupInfo : AssetGroupBinding;
    [<JsonProperty(PropertyName = "asset_id")>]
    AssetId : string;
    [<JsonProperty(PropertyName = "asset_type")>]
    AssetType : AssetTypeResponse;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : string[];
  }

  //#endregion
