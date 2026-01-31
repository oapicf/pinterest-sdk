namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DetailedError =

  //#region DetailedError

  [<CLIMutable>]
  type DetailedError = {
    [<JsonProperty(PropertyName = "code")>]
    Code : int;
    [<JsonProperty(PropertyName = "details")>]
    Details : obj;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
