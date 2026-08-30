namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DeliveryMetricsResponseItemsItems

module DeliveryMetricsGet200Response =

  //#region DeliveryMetricsGet200Response

  [<CLIMutable>]
  type DeliveryMetricsGet200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : DeliveryMetricsResponseItemsItems[];
  }

  //#endregion
