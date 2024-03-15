namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Exception =

  //#region Exception

  [<CLIMutable>]
  type Exception = {
    [<JsonProperty(PropertyName = "code")>]
    Code : int;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
