namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DeliveryMetricsResponseItemsInner

module DeliveryMetricsResponse =

  //#region DeliveryMetricsResponse

  [<CLIMutable>]
  type DeliveryMetricsResponse = {
    [<JsonProperty(PropertyName = "items")>]
    Items : DeliveryMetricsResponseItemsInner[];
  }

  //#endregion
