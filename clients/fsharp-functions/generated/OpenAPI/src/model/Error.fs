namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Error =

  //#region Error

  [<CLIMutable>]
  type Error = {
    [<JsonProperty(PropertyName = "code")>]
    Code : int;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
