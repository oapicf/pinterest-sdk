namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AssetAccessRequestError =

  //#region AssetAccessRequestError

  [<CLIMutable>]
  type AssetAccessRequestError = {
    [<JsonProperty(PropertyName = "code")>]
    Code : int;
    [<JsonProperty(PropertyName = "messages")>]
    Messages : string[];
  }

  //#endregion
