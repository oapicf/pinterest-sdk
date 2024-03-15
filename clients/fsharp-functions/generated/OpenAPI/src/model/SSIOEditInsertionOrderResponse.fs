namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SSIOEditInsertionOrderResponse =

  //#region SSIOEditInsertionOrderResponse

  [<CLIMutable>]
  type SSIOEditInsertionOrderResponse = {
    [<JsonProperty(PropertyName = "pin_order_id")>]
    PinOrderId : string;
  }

  //#endregion
