namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.IneligibleProductTagReason

module IneligibleProductTagErrorItem =

  //#region IneligibleProductTagErrorItem

  [<CLIMutable>]
  type IneligibleProductTagErrorItem = {
    [<JsonProperty(PropertyName = "error_message")>]
    ErrorMessage : IneligibleProductTagReason;
    [<JsonProperty(PropertyName = "pin_id")>]
    PinId : string;
  }

  //#endregion
