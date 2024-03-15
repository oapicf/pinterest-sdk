namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OptimizationGoalMetadataConversionTagV3GoalMetadata
open OpenAPI.Model.OptimizationGoalMetadataFrequencyGoalMetadata
open OpenAPI.Model.OptimizationGoalMetadataScrollupGoalMetadata

module AdGroupCommonOptimizationGoalMetadata =

  //#region AdGroupCommonOptimizationGoalMetadata


  type AdGroupCommon_optimization_goal_metadata = {
    ConversionTagV3GoalMetadata : OptimizationGoalMetadataConversionTagV3GoalMetadata;
    FrequencyGoalMetadata : OptimizationGoalMetadataFrequencyGoalMetadata;
    ScrollupGoalMetadata : OptimizationGoalMetadataScrollupGoalMetadata;
  }
  //#endregion
