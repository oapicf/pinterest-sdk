namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module AdUpdateRequestAllOf1 =

  //#region AdUpdateRequestAllOf1

  [<CLIMutable>]
  type AdUpdateRequestAllOf1 = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "pin_id")>]
    PinId : string option;
  }

  //#endregion
