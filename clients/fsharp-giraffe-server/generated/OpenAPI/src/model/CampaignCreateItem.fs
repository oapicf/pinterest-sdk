namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignBidOptions
open OpenAPI.Model.ConversionObjectiveType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.IntendedPromotionType
open OpenAPI.Model.MobileAppPlatform
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.bool option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CampaignCreateItem =

  //#region CampaignCreateItem


  type CampaignCreateItem = {
    AdAccountId : string;
    AppId : string;
    AppPlatform : MobileAppPlatform;
    BidOptions : CampaignBidOptions;
    DailySpendCap : int option;
    DefaultAdGroupBudgetInMicroCurrency : int option;
    EndTime : int option;
    IntendedPromotionType : IntendedPromotionType;
    IsAutomatedCampaign : bool option;
    IsCampaignBudgetOptimization : bool option;
    IsFlexibleDailyBudgets : bool option;
    IsLtvOptimized : bool;
    IsPerformancePlus : bool;
    IsTopOfSearch : bool;
    LifetimeSpendCap : int option;
    Name : string;
    ObjectiveType : ConversionObjectiveType;
    OrderLineId : string option;
    StartTime : int option;
    Status : EntityStatus;
    TrackingUrls : TrackingUrls;
  }
  //#endregion
