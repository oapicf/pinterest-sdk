namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdGroupAudienceSizingCreativeTypes
open OpenAPI.Model.AdGroupDeliveryEstimatesKeywordsItems
open OpenAPI.Model.OptimizationGoalMetadata
open OpenAPI.Model.OptimizationType
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.TargetingSpecOptimal

module AdGroupDeliveryEstimates =

  //#region AdGroupDeliveryEstimates

  [<CLIMutable>]
  type AdGroupDeliveryEstimates = {
    [<JsonProperty(PropertyName = "auto_targeting_enabled")>]
    AutoTargetingEnabled : bool;
    [<JsonProperty(PropertyName = "creative_types")>]
    CreativeTypes : AdGroupAudienceSizingCreativeTypes[];
    [<JsonProperty(PropertyName = "keywords")>]
    Keywords : AdGroupDeliveryEstimatesKeywordsItems[];
    [<JsonProperty(PropertyName = "monthly_frequency_cap")>]
    MonthlyFrequencyCap : int;
    [<JsonProperty(PropertyName = "optimization_goal_metadata")>]
    OptimizationGoalMetadata : OptimizationGoalMetadata;
    [<JsonProperty(PropertyName = "optimization_type")>]
    OptimizationType : OptimizationType;
    [<JsonProperty(PropertyName = "placement_group")>]
    PlacementGroup : PlacementGroupType;
    [<JsonProperty(PropertyName = "product_group_ids")>]
    ProductGroupIds : string[];
    [<JsonProperty(PropertyName = "targeting_spec")>]
    TargetingSpec : TargetingSpecOptimal;
  }

  //#endregion
