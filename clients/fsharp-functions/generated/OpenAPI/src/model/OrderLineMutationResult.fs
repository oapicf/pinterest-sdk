namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrderLine
open OpenAPI.Model.OrderLineMutationError

module OrderLineMutationResult =

  //#region OrderLineMutationResult

  [<CLIMutable>]
  type OrderLineMutationResult = {
    [<JsonProperty(PropertyName = "errors")>]
    Errors : OrderLineMutationError[];
    [<JsonProperty(PropertyName = "order_line")>]
    OrderLine : OrderLine[];
  }

  //#endregion
