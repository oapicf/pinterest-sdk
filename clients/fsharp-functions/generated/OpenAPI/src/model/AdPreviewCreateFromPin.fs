namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdPreviewCreateFromPin =

  //#region AdPreviewCreateFromPin

  [<CLIMutable>]
  type AdPreviewCreateFromPin = {
    [<JsonProperty(PropertyName = "pin_id")>]
    PinId : string;
  }

  //#endregion
