namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TopVideoPinsAnalyticsResponseDateAvailability
open OpenAPI.Model.TopVideoPinsAnalyticsResponsePinsItems
open OpenAPI.Model.TopVideoPinsSortBy

module TopVideoPinsAnalyticsResponse =

  //#region TopVideoPinsAnalyticsResponse


  type TopVideoPinsAnalyticsResponse = {
    DateAvailability : TopVideoPinsAnalyticsResponseDateAvailability;
    Pins : TopVideoPinsAnalyticsResponsePinsItems[];
    SortBy : TopVideoPinsSortBy;
  }
  //#endregion
