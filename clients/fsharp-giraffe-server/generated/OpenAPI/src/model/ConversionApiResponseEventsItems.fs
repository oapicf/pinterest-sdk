namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EventProcessingStatus
open OpenAPI.Model.string option

module ConversionApiResponseEventsItems =

  //#region ConversionApiResponseEventsItems


  type ConversionApiResponseEventsItems = {
    ErrorMessage : string option;
    Status : EventProcessingStatus;
    WarningMessage : string option;
  }
  //#endregion
