namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionTagV3GoalMetadata
open OpenAPI.Model.FrequencyGoalMetadata
open OpenAPI.Model.ScrollupGoalMetadata

module OptimizationGoalMetadata =

  //#region OptimizationGoalMetadata


  type OptimizationGoalMetadata = {
    ConversionTagV3GoalMetadata : ConversionTagV3GoalMetadata;
    FrequencyGoalMetadata : FrequencyGoalMetadata;
    ScrollupGoalMetadata : ScrollupGoalMetadata;
  }
  //#endregion
