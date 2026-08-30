namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SupplementalItemValidationEvent =

  //#region SupplementalItemValidationEvent

  [<CLIMutable>]
  type SupplementalItemValidationEvent = {
    [<JsonProperty(PropertyName = "attribute")>]
    Attribute : string;
    [<JsonProperty(PropertyName = "code")>]
    Code : int;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
