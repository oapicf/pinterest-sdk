namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TopVideoPinsAnalyticsResponseDateAvailability
open OpenAPI.Model.TopVideoPinsAnalyticsResponsePinsItems
open OpenAPI.Model.TopVideoPinsSortBy

module TopVideoPinsAnalyticsResponse =

  //#region TopVideoPinsAnalyticsResponse

  [<CLIMutable>]
  type TopVideoPinsAnalyticsResponse = {
    [<JsonProperty(PropertyName = "date_availability")>]
    DateAvailability : TopVideoPinsAnalyticsResponseDateAvailability;
    [<JsonProperty(PropertyName = "pins")>]
    Pins : TopVideoPinsAnalyticsResponsePinsItems[];
    [<JsonProperty(PropertyName = "sort_by")>]
    SortBy : TopVideoPinsSortBy;
  }

  //#endregion
