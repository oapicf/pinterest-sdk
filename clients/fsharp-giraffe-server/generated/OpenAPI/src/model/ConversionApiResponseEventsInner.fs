namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module ConversionApiResponseEventsInner =

  //#region ConversionApiResponseEventsInner

  //#region enums
  type StatusEnum = FailedEnum of string  |  ProcessedEnum of string  
  //#endregion

  type ConversionApiResponse_events_inner = {
    Status : StatusEnum;
    ErrorMessage : string option;
    WarningMessage : string option;
  }
  //#endregion
