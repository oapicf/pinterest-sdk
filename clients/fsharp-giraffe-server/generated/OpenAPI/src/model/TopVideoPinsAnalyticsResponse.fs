namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TopPinsAnalyticsResponseDateAvailability
open OpenAPI.Model.TopVideoPinsAnalyticsResponsePinsInner

module TopVideoPinsAnalyticsResponse =

  //#region TopVideoPinsAnalyticsResponse

  //#region enums
  type SortByEnum = SAVEEnum of string  |  IMPRESSIONEnum of string  |  OUTBOUNDCLICKEnum of string  |  VIDEOMRCVIEWEnum of string  |  VIDEOAVGWATCHTIMEEnum of string  |  VIDEOV50WATCHTIMEEnum of string  |  QUARTILE95PERCENTVIEWEnum of string  |  VIDEO10SVIEWEnum of string  |  VIDEOSTARTEnum of string  
  //#endregion

  type TopVideoPinsAnalyticsResponse = {
    DateAvailability : TopPinsAnalyticsResponseDateAvailability;
    Pins : TopVideoPinsAnalyticsResponsePinsInner[];
    SortBy : SortByEnum;
  }
  //#endregion
