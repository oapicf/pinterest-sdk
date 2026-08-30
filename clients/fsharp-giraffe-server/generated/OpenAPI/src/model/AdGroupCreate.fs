namespace OpenAPI.Model

open System
open System.Collections.Generic
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

module AdGroupCreate =

  //#region AdGroupCreate


  type AdGroupCreate = {
    AdAccountId : string;
    BidInMicroCurrency : int option;
    BidStrategyType : BidStrategyType;
    BillableEvent : ActionType;
    BudgetInMicroCurrency : int option;
    CampaignId : string;
    ConversionLearningModeType : ConversionLearningModeType;
    CreatedTime : int;
    CustomerSegmentId : string;
    DcaAssets : AnyType;
    EndTime : int option;
    ExtFeatures : AdgroupTrackingFeatures;
    FeedProfileId : string;
    Id : string;
    IsCreativeOptimization : bool option;
    IsLocalInventory : bool;
    LifetimeFrequencyCap : int;
    LocalInventoryRadiusInMiles : decimal;
    Name : string;
    OptimizationGoalMetadata : NullableOptimizationGoalMetadata;
    PerformancePlusCampaignSettings : PerformancePlusCampaignSettings;
    PlacementGroup : PlacementGroupType;
    PlacementTrafficType : PlacementTrafficType;
    PromotionApplicationLevel : PromotionApplicationLevel;
    PromotionId : string option;
    PromotionIds : string[];
    StartTime : int option;
    Status : EntityStatus;
    SummaryStatus : SummaryStatus;
    TargetingSpec : TargetingSpecOptimal;
    TargetingTemplateIds : string[];
    TrackingUrls : AdGroupTrackingURLs;
    Type : string;
    UpdatedTime : int;
    AutoTargetingEnabled : bool;
    BidMultiplier : decimal;
    BudgetType : BudgetType;
    PacingDeliveryType : PacingDeliveryType;
  }
  //#endregion
