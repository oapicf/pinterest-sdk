namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionApiResponseEventsInner

module ConversionApiResponse =

  //#region ConversionApiResponse


  type ConversionApiResponse = {
    NumEventsReceived : int;
    NumEventsProcessed : int;
    Events : ConversionApiResponseEventsInner[];
  }
  //#endregion
