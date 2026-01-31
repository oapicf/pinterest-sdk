namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionApiResponseEventsInner

module ConversionApiResponse =

  //#region ConversionApiResponse


  type ConversionApiResponse = {
    Events : ConversionApiResponseEventsInner[];
    NumEventsProcessed : int;
    NumEventsReceived : int;
  }
  //#endregion
