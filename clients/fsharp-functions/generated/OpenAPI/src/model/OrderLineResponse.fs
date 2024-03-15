namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrderLine
open OpenAPI.Model.OrderLineError

module OrderLineResponse =

  //#region OrderLineResponse

  [<CLIMutable>]
  type OrderLineResponse = {
    [<JsonProperty(PropertyName = "errors")>]
    Errors : OrderLineError[];
    [<JsonProperty(PropertyName = "order_line")>]
    OrderLine : OrderLine[];
  }

  //#endregion
