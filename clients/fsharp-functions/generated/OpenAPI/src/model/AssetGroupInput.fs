namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssetGroupBinding

module AssetGroupInput =

  //#region AssetGroupInput

  [<CLIMutable>]
  type AssetGroupInput = {
    [<JsonProperty(PropertyName = "asset_group")>]
    AssetGroup : AssetGroupBinding;
  }

  //#endregion
