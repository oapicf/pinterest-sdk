namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssetGroupBinding

module AssetIdPermissions =

  //#region AssetIdPermissions

  [<CLIMutable>]
  type AssetIdPermissions = {
    [<JsonProperty(PropertyName = "asset_id")>]
    AssetId : string;
    [<JsonProperty(PropertyName = "asset_type")>]
    AssetType : string;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : string[];
    [<JsonProperty(PropertyName = "asset_group_info")>]
    AssetGroupInfo : AssetGroupBinding;
  }

  //#endregion
