namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdvertiserDefinedEvent

module AdvertiserDefinedEventsResponse =

  //#region AdvertiserDefinedEventsResponse

  [<CLIMutable>]
  type AdvertiserDefinedEventsResponse = {
    [<JsonProperty(PropertyName = "items")>]
    Items : AdvertiserDefinedEvent[];
  }

  //#endregion
