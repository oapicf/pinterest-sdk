namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TopVideoPinsAnalyticsResponseDateAvailability =

  //#region TopVideoPinsAnalyticsResponseDateAvailability

  [<CLIMutable>]
  type TopVideoPinsAnalyticsResponseDateAvailability = {
    [<JsonProperty(PropertyName = "is_realtime")>]
    IsRealtime : bool;
    [<JsonProperty(PropertyName = "latest_available_timestamp")>]
    LatestAvailableTimestamp : decimal;
  }

  //#endregion
