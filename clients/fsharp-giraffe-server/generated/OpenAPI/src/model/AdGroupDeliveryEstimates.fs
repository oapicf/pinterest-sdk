namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdGroupAudienceSizingCreativeTypes
open OpenAPI.Model.AdGroupDeliveryEstimatesKeywordsItems
open OpenAPI.Model.OptimizationGoalMetadata
open OpenAPI.Model.OptimizationType
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.TargetingSpecOptimal

module AdGroupDeliveryEstimates =

  //#region AdGroupDeliveryEstimates


  type AdGroupDeliveryEstimates = {
    AutoTargetingEnabled : bool;
    CreativeTypes : AdGroupAudienceSizingCreativeTypes[];
    Keywords : AdGroupDeliveryEstimatesKeywordsItems[];
    MonthlyFrequencyCap : int;
    OptimizationGoalMetadata : OptimizationGoalMetadata;
    OptimizationType : OptimizationType;
    PlacementGroup : PlacementGroupType;
    ProductGroupIds : string[];
    TargetingSpec : TargetingSpecOptimal;
  }
  //#endregion
