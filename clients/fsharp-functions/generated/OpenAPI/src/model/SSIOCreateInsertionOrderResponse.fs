namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SSIOCreateInsertionOrderResponse =

  //#region SSIOCreateInsertionOrderResponse

  [<CLIMutable>]
  type SSIOCreateInsertionOrderResponse = {
    [<JsonProperty(PropertyName = "pin_order_id")>]
    PinOrderId : string;
  }

  //#endregion
