namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignBidOptionsCreate
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.IntendedPromotionType
open OpenAPI.Model.ObjectiveType
open OpenAPI.Model.bool option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CampaignCreateRequest =

  //#region CampaignCreateRequest


  type CampaignCreateRequest = {
    BidOptions : CampaignBidOptionsCreate;
    IntendedPromotionType : IntendedPromotionType;
    IsAutomatedCampaign : bool option;
    IsCampaignBudgetOptimization : bool option;
    IsFlexibleDailyBudgets : bool option;
    IsLtvOptimized : bool;
    IsPerformancePlus : bool;
    IsTopOfSearch : bool;
    ObjectiveType : ObjectiveType;
    Status : EntityStatus;
    AdAccountId : string;
    DailySpendCap : int option;
    DefaultAdGroupBudgetInMicroCurrency : int option;
    EndTime : int option;
    LifetimeSpendCap : int option;
    Name : string;
    OrderLineId : string option;
    StartTime : int option;
    TrackingUrls : obj;
  }
  //#endregion
