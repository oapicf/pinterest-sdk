namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrderLines

module OrderLinesArrayResponse =

  //#region OrderLinesArrayResponse

  [<CLIMutable>]
  type OrderLinesArrayResponse = {
    [<JsonProperty(PropertyName = "items")>]
    Items : OrderLines[];
  }

  //#endregion
