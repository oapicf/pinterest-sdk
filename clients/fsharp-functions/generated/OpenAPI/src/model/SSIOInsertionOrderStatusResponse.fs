namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module SSIOInsertionOrderStatusResponse =

  //#region SSIOInsertionOrderStatusResponse

  [<CLIMutable>]
  type SSIOInsertionOrderStatusResponse = {
    [<JsonProperty(PropertyName = "pin_order_id")>]
    PinOrderId : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "creation_time")>]
    CreationTime : string option;
  }

  //#endregion
