namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignBidOptionsUpdate
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.IntendedPromotionType
open OpenAPI.Model.ObjectiveType
open OpenAPI.Model.bool option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CampaignUpdateRequest =

  //#region CampaignUpdateRequest


  type CampaignUpdateRequest = {
    BidOptions : CampaignBidOptionsUpdate;
    IntendedPromotionType : IntendedPromotionType;
    IsLtvOptimized : bool;
    IsPerformancePlus : bool;
    IsTopOfSearch : bool;
    ObjectiveType : ObjectiveType;
    AdAccountId : string;
    DailySpendCap : int option;
    DefaultAdGroupBudgetInMicroCurrency : int option;
    EndTime : int option;
    Id : string;
    IsAutomatedCampaign : bool option;
    IsCampaignBudgetOptimization : bool option;
    IsFlexibleDailyBudgets : bool option;
    LifetimeSpendCap : int option;
    Name : string;
    OrderLineId : string option;
    StartTime : int option;
    Status : EntityStatus;
    TrackingUrls : obj;
  }
  //#endregion
