namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module ConversionApiResponseEventsInner =

  //#region ConversionApiResponseEventsInner

  [<CLIMutable>]
  type ConversionApiResponseEventsInner = {
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "error_message")>]
    ErrorMessage : string option;
    [<JsonProperty(PropertyName = "warning_message")>]
    WarningMessage : string option;
  }

  //#endregion
