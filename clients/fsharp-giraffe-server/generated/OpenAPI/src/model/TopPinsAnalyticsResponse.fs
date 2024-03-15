namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TopPinsAnalyticsResponseDateAvailability
open OpenAPI.Model.TopPinsAnalyticsResponsePinsInner

module TopPinsAnalyticsResponse =

  //#region TopPinsAnalyticsResponse

  //#region enums
  type SortByEnum = ENGAGEMENTEnum of string  |  SAVEEnum of string  |  IMPRESSIONEnum of string  |  OUTBOUNDCLICKEnum of string  |  PINCLICKEnum of string  
  //#endregion

  type TopPinsAnalyticsResponse = {
    DateAvailability : TopPinsAnalyticsResponseDateAvailability;
    Pins : TopPinsAnalyticsResponsePinsInner[];
    SortBy : SortByEnum;
  }
  //#endregion
