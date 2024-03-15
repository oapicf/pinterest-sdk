namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TopPinsAnalyticsResponseDateAvailability
open OpenAPI.Model.TopPinsAnalyticsResponsePinsInner

module TopPinsAnalyticsResponse =

  //#region TopPinsAnalyticsResponse

  [<CLIMutable>]
  type TopPinsAnalyticsResponse = {
    [<JsonProperty(PropertyName = "date_availability")>]
    DateAvailability : TopPinsAnalyticsResponseDateAvailability;
    [<JsonProperty(PropertyName = "pins")>]
    Pins : TopPinsAnalyticsResponsePinsInner[];
    [<JsonProperty(PropertyName = "sort_by")>]
    SortBy : string;
  }

  //#endregion
