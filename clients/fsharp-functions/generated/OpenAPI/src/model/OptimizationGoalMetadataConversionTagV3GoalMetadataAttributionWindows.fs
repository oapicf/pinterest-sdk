namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows =

  //#region OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows

  [<CLIMutable>]
  type OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows = {
    [<JsonProperty(PropertyName = "click_window_days")>]
    ClickWindowDays : int;
    [<JsonProperty(PropertyName = "engagement_window_days")>]
    EngagementWindowDays : int;
    [<JsonProperty(PropertyName = "view_window_days")>]
    ViewWindowDays : int;
  }

  //#endregion
