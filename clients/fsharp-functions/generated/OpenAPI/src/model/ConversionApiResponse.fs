namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionApiResponseEventsInner

module ConversionApiResponse =

  //#region ConversionApiResponse

  [<CLIMutable>]
  type ConversionApiResponse = {
    [<JsonProperty(PropertyName = "num_events_received")>]
    NumEventsReceived : int;
    [<JsonProperty(PropertyName = "num_events_processed")>]
    NumEventsProcessed : int;
    [<JsonProperty(PropertyName = "events")>]
    Events : ConversionApiResponseEventsInner[];
  }

  //#endregion
