namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionApiResponseEventsItems

module ConversionEvents =

  //#region ConversionEvents

  [<CLIMutable>]
  type ConversionEvents = {
    [<JsonProperty(PropertyName = "events")>]
    Events : ConversionApiResponseEventsItems[];
    [<JsonProperty(PropertyName = "num_events_processed")>]
    NumEventsProcessed : int;
    [<JsonProperty(PropertyName = "num_events_received")>]
    NumEventsReceived : int;
  }

  //#endregion
