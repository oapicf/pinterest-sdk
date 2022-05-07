namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ItemValidationEvent =

  //#region ItemValidationEvent

  [<CLIMutable>]
  type ItemValidationEvent = {
    [<JsonProperty(PropertyName = "attribute")>]
    Attribute : string;
    [<JsonProperty(PropertyName = "code")>]
    Code : int;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
