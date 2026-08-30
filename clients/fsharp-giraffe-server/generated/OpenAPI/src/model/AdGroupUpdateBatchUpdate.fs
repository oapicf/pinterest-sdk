namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ActionType
open OpenAPI.Model.AdGroupTrackingURLs
open OpenAPI.Model.AdgroupTrackingFeatures
open OpenAPI.Model.BidStrategyType
open OpenAPI.Model.BudgetType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.NullableOptimizationGoalMetadata
open OpenAPI.Model.PacingDeliveryType
open OpenAPI.Model.PerformancePlusCampaignSettings
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.PlacementTrafficType
open OpenAPI.Model.PromotionApplicationLevel
open OpenAPI.Model.TargetingSpecOperations
open OpenAPI.Model.TargetingSpecOptimal
open OpenAPI.Model.bool option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module AdGroupUpdateBatchUpdate =

  //#region AdGroupUpdateBatchUpdate


  type AdGroupUpdateBatchUpdate = {
    AutoTargetingEnabled : bool option;
    BidInMicroCurrency : int option;
    BidMultiplier : decimal;
    BidStrategyType : BidStrategyType;
    BillableEvent : ActionType;
    BudgetInMicroCurrency : int option;
    BudgetType : BudgetType;
    CampaignId : string;
    CustomerSegmentId : string;
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
    PacingDeliveryType : PacingDeliveryType;
    PerformancePlusCampaignSettings : PerformancePlusCampaignSettings;
    PlacementGroup : PlacementGroupType;
    PlacementTrafficType : PlacementTrafficType;
    PromotionApplicationLevel : PromotionApplicationLevel;
    PromotionId : string option;
    PromotionIds : string[];
    StartTime : int option;
    Status : EntityStatus;
    TargetingSpec : TargetingSpecOptimal;
    TargetingSpecOperations : TargetingSpecOperations[];
    TargetingTemplateIds : string[];
    TrackingUrls : AdGroupTrackingURLs;
  }
  //#endregion
