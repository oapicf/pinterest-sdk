namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdPinId =

  //#region AdPinId

  [<CLIMutable>]
  type AdPinId = {
    [<JsonProperty(PropertyName = "pin_id")>]
    PinId : string;
  }

  //#endregion
