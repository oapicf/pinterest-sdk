namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OptimizationGoalMetadataConversionTagV3GoalMetadata
open OpenAPI.Model.OptimizationGoalMetadataFrequencyGoalMetadata
open OpenAPI.Model.OptimizationGoalMetadataScrollupGoalMetadata

module OptimizationGoalMetadata =

  //#region OptimizationGoalMetadata

  [<CLIMutable>]
  type OptimizationGoalMetadata = {
    [<JsonProperty(PropertyName = "conversion_tag_v3_goal_metadata")>]
    ConversionTagV3GoalMetadata : OptimizationGoalMetadataConversionTagV3GoalMetadata;
    [<JsonProperty(PropertyName = "frequency_goal_metadata")>]
    FrequencyGoalMetadata : OptimizationGoalMetadataFrequencyGoalMetadata;
    [<JsonProperty(PropertyName = "scrollup_goal_metadata")>]
    ScrollupGoalMetadata : OptimizationGoalMetadataScrollupGoalMetadata;
  }

  //#endregion
