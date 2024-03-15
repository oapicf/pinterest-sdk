namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrderLineResponse

module OrderLineSingleResponse =

  //#region OrderLineSingleResponse

  [<CLIMutable>]
  type OrderLineSingleResponse = {
    [<JsonProperty(PropertyName = "data")>]
    Data : OrderLineResponse;
  }

  //#endregion
