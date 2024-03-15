namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TopPinsAnalyticsResponseDateAvailability =

  //#region TopPinsAnalyticsResponseDateAvailability

  [<CLIMutable>]
  type TopPinsAnalyticsResponseDateAvailability = {
    [<JsonProperty(PropertyName = "latest_available_timestamp")>]
    LatestAvailableTimestamp : decimal;
    [<JsonProperty(PropertyName = "is_realtime")>]
    IsRealtime : bool;
  }

  //#endregion
