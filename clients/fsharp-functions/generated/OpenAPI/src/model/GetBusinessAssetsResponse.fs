namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssetGroupBinding

module GetBusinessAssetsResponse =

  //#region GetBusinessAssetsResponse

  [<CLIMutable>]
  type GetBusinessAssetsResponse = {
    [<JsonProperty(PropertyName = "asset_id")>]
    AssetId : string;
    [<JsonProperty(PropertyName = "asset_type")>]
    AssetType : string;
    [<JsonProperty(PropertyName = "asset_group_info")>]
    AssetGroupInfo : AssetGroupBinding;
  }

  //#endregion
