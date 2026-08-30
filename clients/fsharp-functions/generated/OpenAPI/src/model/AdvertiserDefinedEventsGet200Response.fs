namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdvertiserDefinedEvent

module AdvertiserDefinedEventsGet200Response =

  //#region AdvertiserDefinedEventsGet200Response

  [<CLIMutable>]
  type AdvertiserDefinedEventsGet200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : AdvertiserDefinedEvent[];
  }

  //#endregion
