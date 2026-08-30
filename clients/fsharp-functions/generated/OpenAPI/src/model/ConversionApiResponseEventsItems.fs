namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EventProcessingStatus
open OpenAPI.Model.string option

module ConversionApiResponseEventsItems =

  //#region ConversionApiResponseEventsItems

  [<CLIMutable>]
  type ConversionApiResponseEventsItems = {
    [<JsonProperty(PropertyName = "error_message")>]
    ErrorMessage : string option;
    [<JsonProperty(PropertyName = "status")>]
    Status : EventProcessingStatus;
    [<JsonProperty(PropertyName = "warning_message")>]
    WarningMessage : string option;
  }

  //#endregion
