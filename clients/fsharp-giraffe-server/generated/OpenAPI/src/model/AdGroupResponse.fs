namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ActionType
open OpenAPI.Model.AdGroupSummaryStatus
open OpenAPI.Model.AnyType
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

module AdGroupResponse =

  //#region AdGroupResponse

  //#region enums
  type BidStrategyTypeEnum = AUTOMATICBIDEnum of string option  |  MAXBIDEnum of string option  |  TARGETAVGEnum of string option  
  //#endregion
  //#region enums
  type ConversionLearningModeTypeEnum = NOTACTIVEEnum of string option  |  ACTIVEEnum of string option  
  //#endregion

  type AdGroupResponse = {
    Name : string;
    Status : EntityStatus;
    BudgetInMicroCurrency : int option;
    BidInMicroCurrency : int option;
    OptimizationGoalMetadata : OptimizationGoalMetadata;
    BudgetType : BudgetType;
    StartTime : int option;
    EndTime : int option;
    TargetingSpec : TargetingSpec;
    LifetimeFrequencyCap : int;
    TrackingUrls : TrackingUrls;
    AutoTargetingEnabled : bool option;
    PlacementGroup : PlacementGroupType;
    PacingDeliveryType : PacingDeliveryType;
    CampaignId : string;
    BillableEvent : ActionType;
    BidStrategyType : BidStrategyTypeEnum;
    TargetingTemplateIds : string[];
    Id : string;
    AdAccountId : string;
    CreatedTime : int;
    UpdatedTime : int;
    Type : string;
    ConversionLearningModeType : ConversionLearningModeTypeEnum;
    SummaryStatus : AdGroupSummaryStatus;
    FeedProfileId : string;
    DcaAssets : AnyType;
  }
  //#endregion
