namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionApiResponseEventsItems

module ConversionEvents =

  //#region ConversionEvents


  type ConversionEvents = {
    Events : ConversionApiResponseEventsItems[];
    NumEventsProcessed : int;
    NumEventsReceived : int;
  }
  //#endregion
