namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
open OpenAPI.Model.bool option
open OpenAPI.Model.string option

module OptimizationGoalMetadataConversionTagV3GoalMetadata =

  //#region OptimizationGoalMetadataConversionTagV3GoalMetadata

  [<CLIMutable>]
  type OptimizationGoalMetadataConversionTagV3GoalMetadata = {
    [<JsonProperty(PropertyName = "attribution_windows")>]
    AttributionWindows : OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows;
    [<JsonProperty(PropertyName = "conversion_event")>]
    ConversionEvent : string;
    [<JsonProperty(PropertyName = "conversion_tag_id")>]
    ConversionTagId : string;
    [<JsonProperty(PropertyName = "cpa_goal_value_in_micro_currency")>]
    CpaGoalValueInMicroCurrency : string;
    [<JsonProperty(PropertyName = "is_roas_optimized")>]
    IsRoasOptimized : bool option;
    [<JsonProperty(PropertyName = "learning_mode_type")>]
    LearningModeType : string option;
  }

  //#endregion
