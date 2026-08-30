namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrderLineMutationResult

module OrderLineMutationResponse =

  //#region OrderLineMutationResponse

  [<CLIMutable>]
  type OrderLineMutationResponse = {
    [<JsonProperty(PropertyName = "data")>]
    Data : OrderLineMutationResult;
  }

  //#endregion
