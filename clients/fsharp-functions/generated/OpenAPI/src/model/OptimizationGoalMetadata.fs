namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionTagV3GoalMetadata
open OpenAPI.Model.FrequencyGoalMetadata
open OpenAPI.Model.ScrollupGoalMetadata

module OptimizationGoalMetadata =

  //#region OptimizationGoalMetadata

  [<CLIMutable>]
  type OptimizationGoalMetadata = {
    [<JsonProperty(PropertyName = "conversion_tag_v3_goal_metadata")>]
    ConversionTagV3GoalMetadata : ConversionTagV3GoalMetadata;
    [<JsonProperty(PropertyName = "frequency_goal_metadata")>]
    FrequencyGoalMetadata : FrequencyGoalMetadata;
    [<JsonProperty(PropertyName = "scrollup_goal_metadata")>]
    ScrollupGoalMetadata : ScrollupGoalMetadata;
  }

  //#endregion
