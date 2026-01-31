namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeleteAssetGroupResponseExceptionsInner =

  //#region DeleteAssetGroupResponseExceptionsInner

  [<CLIMutable>]
  type DeleteAssetGroupResponseExceptionsInner = {
    [<JsonProperty(PropertyName = "asset_group_id")>]
    AssetGroupId : string;
    [<JsonProperty(PropertyName = "code")>]
    Code : int;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
