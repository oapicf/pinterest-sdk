namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ActionType
open OpenAPI.Model.AdGroupTrackingURLs
open OpenAPI.Model.AdgroupTrackingFeatures
open OpenAPI.Model.AnyType
open OpenAPI.Model.BidStrategyType
open OpenAPI.Model.BudgetType
open OpenAPI.Model.ConversionLearningModeType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.NullableOptimizationGoalMetadata
open OpenAPI.Model.PacingDeliveryType
open OpenAPI.Model.PerformancePlusCampaignSettings
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.PlacementTrafficType
open OpenAPI.Model.PromotionApplicationLevel
open OpenAPI.Model.SummaryStatus
open OpenAPI.Model.TargetingSpecOptimal
open OpenAPI.Model.bool option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module AdGroupUpdate =

  //#region AdGroupUpdate

  [<CLIMutable>]
  type AdGroupUpdate = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "bid_in_micro_currency")>]
    BidInMicroCurrency : int option;
    [<JsonProperty(PropertyName = "bid_strategy_type")>]
    BidStrategyType : BidStrategyType;
    [<JsonProperty(PropertyName = "billable_event")>]
    BillableEvent : ActionType;
    [<JsonProperty(PropertyName = "budget_in_micro_currency")>]
    BudgetInMicroCurrency : int option;
    [<JsonProperty(PropertyName = "campaign_id")>]
    CampaignId : string;
    [<JsonProperty(PropertyName = "conversion_learning_mode_type")>]
    ConversionLearningModeType : ConversionLearningModeType;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int;
    [<JsonProperty(PropertyName = "customer_segment_id")>]
    CustomerSegmentId : string;
    [<JsonProperty(PropertyName = "dca_assets")>]
    DcaAssets : AnyType;
    [<JsonProperty(PropertyName = "end_time")>]
    EndTime : int option;
    [<JsonProperty(PropertyName = "ext_features")>]
    ExtFeatures : AdgroupTrackingFeatures;
    [<JsonProperty(PropertyName = "feed_profile_id")>]
    FeedProfileId : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "is_creative_optimization")>]
    IsCreativeOptimization : bool option;
    [<JsonProperty(PropertyName = "is_local_inventory")>]
    IsLocalInventory : bool;
    [<JsonProperty(PropertyName = "lifetime_frequency_cap")>]
    LifetimeFrequencyCap : int;
    [<JsonProperty(PropertyName = "local_inventory_radius_in_miles")>]
    LocalInventoryRadiusInMiles : decimal;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "optimization_goal_metadata")>]
    OptimizationGoalMetadata : NullableOptimizationGoalMetadata;
    [<JsonProperty(PropertyName = "performance_plus_campaign_settings")>]
    PerformancePlusCampaignSettings : PerformancePlusCampaignSettings;
    [<JsonProperty(PropertyName = "placement_group")>]
    PlacementGroup : PlacementGroupType;
    [<JsonProperty(PropertyName = "placement_traffic_type")>]
    PlacementTrafficType : PlacementTrafficType;
    [<JsonProperty(PropertyName = "promotion_application_level")>]
    PromotionApplicationLevel : PromotionApplicationLevel;
    [<JsonProperty(PropertyName = "promotion_id")>]
    PromotionId : string option;
    [<JsonProperty(PropertyName = "promotion_ids")>]
    PromotionIds : string[];
    [<JsonProperty(PropertyName = "start_time")>]
    StartTime : int option;
    [<JsonProperty(PropertyName = "status")>]
    Status : EntityStatus;
    [<JsonProperty(PropertyName = "summary_status")>]
    SummaryStatus : SummaryStatus;
    [<JsonProperty(PropertyName = "targeting_spec")>]
    TargetingSpec : TargetingSpecOptimal;
    [<JsonProperty(PropertyName = "targeting_template_ids")>]
    TargetingTemplateIds : string[];
    [<JsonProperty(PropertyName = "tracking_urls")>]
    TrackingUrls : AdGroupTrackingURLs;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "updated_time")>]
    UpdatedTime : int;
    [<JsonProperty(PropertyName = "auto_targeting_enabled")>]
    AutoTargetingEnabled : bool option;
    [<JsonProperty(PropertyName = "bid_multiplier")>]
    BidMultiplier : decimal;
    [<JsonProperty(PropertyName = "budget_type")>]
    BudgetType : BudgetType;
    [<JsonProperty(PropertyName = "pacing_delivery_type")>]
    PacingDeliveryType : PacingDeliveryType;
  }

  //#endregion
