namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BusinessAccessError =

  //#region BusinessAccessError

  [<CLIMutable>]
  type BusinessAccessError = {
    [<JsonProperty(PropertyName = "code")>]
    Code : int;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
