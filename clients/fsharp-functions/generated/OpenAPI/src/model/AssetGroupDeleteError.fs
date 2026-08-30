namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AssetGroupDeleteError =

  //#region AssetGroupDeleteError

  [<CLIMutable>]
  type AssetGroupDeleteError = {
    [<JsonProperty(PropertyName = "asset_group_id")>]
    AssetGroupId : string;
    [<JsonProperty(PropertyName = "code")>]
    Code : int;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
