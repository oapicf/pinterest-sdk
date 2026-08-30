namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ActionType
open OpenAPI.Model.BidStrategyType
open OpenAPI.Model.BudgetType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.PacingDeliveryType
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.TargetingSpec
open OpenAPI.Model.TargetingSpecOperations
open OpenAPI.Model.bool option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module AdGroupUpdateRequest =

  //#region AdGroupUpdateRequest

  [<CLIMutable>]
  type AdGroupUpdateRequest = {
    [<JsonProperty(PropertyName = "bid_multiplier")>]
    BidMultiplier : decimal;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "targeting_spec_operations")>]
    TargetingSpecOperations : TargetingSpecOperations[];
    [<JsonProperty(PropertyName = "auto_targeting_enabled")>]
    AutoTargetingEnabled : bool option;
    [<JsonProperty(PropertyName = "bid_in_micro_currency")>]
    BidInMicroCurrency : int option;
    [<JsonProperty(PropertyName = "bid_strategy_type")>]
    BidStrategyType : BidStrategyType;
    [<JsonProperty(PropertyName = "billable_event")>]
    BillableEvent : ActionType;
    [<JsonProperty(PropertyName = "budget_in_micro_currency")>]
    BudgetInMicroCurrency : int option;
    [<JsonProperty(PropertyName = "budget_type")>]
    BudgetType : BudgetType;
    [<JsonProperty(PropertyName = "campaign_id")>]
    CampaignId : string;
    [<JsonProperty(PropertyName = "end_time")>]
    EndTime : int option;
    [<JsonProperty(PropertyName = "is_creative_optimization")>]
    IsCreativeOptimization : bool option;
    [<JsonProperty(PropertyName = "lifetime_frequency_cap")>]
    LifetimeFrequencyCap : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "optimization_goal_metadata")>]
    OptimizationGoalMetadata : obj;
    [<JsonProperty(PropertyName = "pacing_delivery_type")>]
    PacingDeliveryType : PacingDeliveryType;
    [<JsonProperty(PropertyName = "placement_group")>]
    PlacementGroup : PlacementGroupType;
    [<JsonProperty(PropertyName = "promotion_application_level")>]
    PromotionApplicationLevel : string option;
    [<JsonProperty(PropertyName = "promotion_id")>]
    PromotionId : string option;
    [<JsonProperty(PropertyName = "promotion_ids")>]
    PromotionIds : string[];
    [<JsonProperty(PropertyName = "start_time")>]
    StartTime : int option;
    [<JsonProperty(PropertyName = "status")>]
    Status : EntityStatus;
    [<JsonProperty(PropertyName = "targeting_spec")>]
    TargetingSpec : TargetingSpec;
    [<JsonProperty(PropertyName = "targeting_template_ids")>]
    TargetingTemplateIds : string[];
    [<JsonProperty(PropertyName = "tracking_urls")>]
    TrackingUrls : obj;
  }

  //#endregion
