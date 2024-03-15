namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TopPinsAnalyticsResponseDateAvailability
open OpenAPI.Model.TopVideoPinsAnalyticsResponsePinsInner

module TopVideoPinsAnalyticsResponse =

  //#region TopVideoPinsAnalyticsResponse

  [<CLIMutable>]
  type TopVideoPinsAnalyticsResponse = {
    [<JsonProperty(PropertyName = "date_availability")>]
    DateAvailability : TopPinsAnalyticsResponseDateAvailability;
    [<JsonProperty(PropertyName = "pins")>]
    Pins : TopVideoPinsAnalyticsResponsePinsInner[];
    [<JsonProperty(PropertyName = "sort_by")>]
    SortBy : string;
  }

  //#endregion
