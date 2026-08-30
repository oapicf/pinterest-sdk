namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ActionType
open OpenAPI.Model.BidStrategyType
open OpenAPI.Model.BudgetType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.PacingDeliveryType
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.TargetingSpec
open OpenAPI.Model.bool option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module AdGroupCreateRequest =

  //#region AdGroupCreateRequest

  //#region enums
  type PromotionApplicationLevelEnum = NONEEnum of string option  |  ITEMEnum of string option  |  ADGROUPEnum of string option  
  //#endregion

  type AdGroupCreateRequest = {
    AutoTargetingEnabled : bool;
    BidMultiplier : decimal;
    BudgetType : BudgetType;
    PacingDeliveryType : PacingDeliveryType;
    BidInMicroCurrency : int option;
    BidStrategyType : BidStrategyType;
    BillableEvent : ActionType;
    BudgetInMicroCurrency : int option;
    CampaignId : string;
    EndTime : int option;
    IsCreativeOptimization : bool option;
    LifetimeFrequencyCap : int;
    Name : string;
    OptimizationGoalMetadata : obj;
    PlacementGroup : PlacementGroupType;
    PromotionApplicationLevel : PromotionApplicationLevelEnum;
    PromotionId : string option;
    PromotionIds : string[];
    StartTime : int option;
    Status : EntityStatus;
    TargetingSpec : TargetingSpec;
    TargetingTemplateIds : string[];
    TrackingUrls : obj;
  }
  //#endregion
