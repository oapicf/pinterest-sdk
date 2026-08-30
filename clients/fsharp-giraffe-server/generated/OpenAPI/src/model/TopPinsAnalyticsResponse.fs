namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TopPinsAnalyticsResponseDateAvailability
open OpenAPI.Model.TopPinsAnalyticsResponsePinsItems
open OpenAPI.Model.TopPinsSortBy

module TopPinsAnalyticsResponse =

  //#region TopPinsAnalyticsResponse


  type TopPinsAnalyticsResponse = {
    DateAvailability : TopPinsAnalyticsResponseDateAvailability;
    Pins : TopPinsAnalyticsResponsePinsItems[];
    SortBy : TopPinsSortBy;
  }
  //#endregion
