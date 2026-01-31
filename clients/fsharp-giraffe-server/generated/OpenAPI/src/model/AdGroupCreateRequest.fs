namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ActionType
open OpenAPI.Model.BudgetType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.OptimizationGoalMetadata
open OpenAPI.Model.PacingDeliveryType
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.TargetingSpec
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.bool option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module AdGroupCreateRequest =

  //#region AdGroupCreateRequest

  //#region enums
  type BidStrategyTypeEnum = AUTOMATICBIDEnum of string option  |  MAXBIDEnum of string option  |  TARGETAVGEnum of string option  
  //#endregion
  //#region enums
  type PromotionApplicationLevelEnum = NONEEnum of string option  |  ITEMEnum of string option  |  ADGROUPEnum of string option  
  //#endregion

  type AdGroupCreateRequest = {
    AutoTargetingEnabled : bool;
    BidInMicroCurrency : int option;
    BidStrategyType : BidStrategyTypeEnum;
    BillableEvent : ActionType;
    BudgetInMicroCurrency : int option;
    BudgetType : BudgetType;
    CampaignId : string;
    EndTime : int option;
    IsCreativeOptimization : bool option;
    LifetimeFrequencyCap : int;
    Name : string;
    OptimizationGoalMetadata : OptimizationGoalMetadata;
    PacingDeliveryType : PacingDeliveryType;
    PlacementGroup : PlacementGroupType;
    PromotionApplicationLevel : PromotionApplicationLevelEnum;
    PromotionId : string option;
    StartTime : int option;
    Status : EntityStatus;
    TargetingSpec : TargetingSpec;
    TargetingTemplateIds : string[];
    TrackingUrls : TrackingUrls;
    BidMultiplier : decimal;
  }
  //#endregion
