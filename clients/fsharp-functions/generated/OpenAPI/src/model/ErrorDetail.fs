namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ErrorDetail =

  //#region ErrorDetail

  [<CLIMutable>]
  type ErrorDetail = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "error_code")>]
    ErrorCode : int;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
