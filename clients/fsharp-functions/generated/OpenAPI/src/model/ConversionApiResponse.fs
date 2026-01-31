namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionApiResponseEventsInner

module ConversionApiResponse =

  //#region ConversionApiResponse

  [<CLIMutable>]
  type ConversionApiResponse = {
    [<JsonProperty(PropertyName = "events")>]
    Events : ConversionApiResponseEventsInner[];
    [<JsonProperty(PropertyName = "num_events_processed")>]
    NumEventsProcessed : int;
    [<JsonProperty(PropertyName = "num_events_received")>]
    NumEventsReceived : int;
  }

  //#endregion
