namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ProductTagItem =

  //#region ProductTagItem

  [<CLIMutable>]
  type ProductTagItem = {
    [<JsonProperty(PropertyName = "pin_id")>]
    PinId : string;
  }

  //#endregion
