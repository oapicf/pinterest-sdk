namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdvertiserDefinedEventProcessingRecord

module AdvertiserDefinedEventsCreate200Response =

  //#region AdvertiserDefinedEventsCreate200Response

  [<CLIMutable>]
  type AdvertiserDefinedEventsCreate200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : AdvertiserDefinedEventProcessingRecord[];
  }

  //#endregion
