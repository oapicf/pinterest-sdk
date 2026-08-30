namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AttributionWindows =

  //#region AttributionWindows

  [<CLIMutable>]
  type AttributionWindows = {
    [<JsonProperty(PropertyName = "click_window_days")>]
    ClickWindowDays : int;
    [<JsonProperty(PropertyName = "engagement_window_days")>]
    EngagementWindowDays : int;
    [<JsonProperty(PropertyName = "view_window_days")>]
    ViewWindowDays : int;
  }

  //#endregion
