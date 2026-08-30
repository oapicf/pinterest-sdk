namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SSIOInsertionOrder =

  //#region SSIOInsertionOrder

  [<CLIMutable>]
  type SSIOInsertionOrder = {
    [<JsonProperty(PropertyName = "pin_order_id")>]
    PinOrderId : string;
  }

  //#endregion
