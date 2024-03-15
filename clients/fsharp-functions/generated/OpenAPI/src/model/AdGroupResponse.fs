namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ActionType
open OpenAPI.Model.AdGroupCommonOptimizationGoalMetadata
open OpenAPI.Model.AdGroupCommonTrackingUrls
open OpenAPI.Model.AdGroupSummaryStatus
open OpenAPI.Model.AnyType
open OpenAPI.Model.BudgetType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.PacingDeliveryType
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.TargetingSpec
open OpenAPI.Model.bool option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module AdGroupResponse =

  //#region AdGroupResponse

  [<CLIMutable>]
  type AdGroupResponse = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : EntityStatus;
    [<JsonProperty(PropertyName = "budget_in_micro_currency")>]
    BudgetInMicroCurrency : int option;
    [<JsonProperty(PropertyName = "bid_in_micro_currency")>]
    BidInMicroCurrency : int option;
    [<JsonProperty(PropertyName = "optimization_goal_metadata")>]
    OptimizationGoalMetadata : AdGroupCommonOptimizationGoalMetadata;
    [<JsonProperty(PropertyName = "budget_type")>]
    BudgetType : BudgetType;
    [<JsonProperty(PropertyName = "start_time")>]
    StartTime : int option;
    [<JsonProperty(PropertyName = "end_time")>]
    EndTime : int option;
    [<JsonProperty(PropertyName = "targeting_spec")>]
    TargetingSpec : TargetingSpec;
    [<JsonProperty(PropertyName = "lifetime_frequency_cap")>]
    LifetimeFrequencyCap : int;
    [<JsonProperty(PropertyName = "tracking_urls")>]
    TrackingUrls : AdGroupCommonTrackingUrls;
    [<JsonProperty(PropertyName = "auto_targeting_enabled")>]
    AutoTargetingEnabled : bool option;
    [<JsonProperty(PropertyName = "placement_group")>]
    PlacementGroup : PlacementGroupType;
    [<JsonProperty(PropertyName = "pacing_delivery_type")>]
    PacingDeliveryType : PacingDeliveryType;
    [<JsonProperty(PropertyName = "campaign_id")>]
    CampaignId : string;
    [<JsonProperty(PropertyName = "billable_event")>]
    BillableEvent : ActionType;
    [<JsonProperty(PropertyName = "bid_strategy_type")>]
    BidStrategyType : string option;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int;
    [<JsonProperty(PropertyName = "updated_time")>]
    UpdatedTime : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "conversion_learning_mode_type")>]
    ConversionLearningModeType : string option;
    [<JsonProperty(PropertyName = "summary_status")>]
    SummaryStatus : AdGroupSummaryStatus;
    [<JsonProperty(PropertyName = "feed_profile_id")>]
    FeedProfileId : string;
    [<JsonProperty(PropertyName = "dca_assets")>]
    DcaAssets : AnyType;
  }

  //#endregion
