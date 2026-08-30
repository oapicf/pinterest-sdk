namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdvertiserDefinedEventInput

module AdvertiserDefinedEventsCreateRequest =

  //#region AdvertiserDefinedEventsCreateRequest

  [<CLIMutable>]
  type AdvertiserDefinedEventsCreateRequest = {
    [<JsonProperty(PropertyName = "items")>]
    Items : AdvertiserDefinedEventInput[];
  }

  //#endregion
