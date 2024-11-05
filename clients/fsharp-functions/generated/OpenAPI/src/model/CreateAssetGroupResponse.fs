namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssetGroupBinding

module CreateAssetGroupResponse =

  //#region CreateAssetGroupResponse

  [<CLIMutable>]
  type CreateAssetGroupResponse = {
    [<JsonProperty(PropertyName = "asset_group")>]
    AssetGroup : AssetGroupBinding;
  }

  //#endregion
