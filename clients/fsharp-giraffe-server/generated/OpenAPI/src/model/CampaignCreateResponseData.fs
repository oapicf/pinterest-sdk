namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignBidOptions
open OpenAPI.Model.CampaignSummaryStatus
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.ObjectiveType
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.bool option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CampaignCreateResponseData =

  //#region CampaignCreateResponseData


  type CampaignCreateResponseData = {
    AdAccountId : string;
    DailySpendCap : int option;
    EndTime : int option;
    IsAutomatedCampaign : bool option;
    IsFlexibleDailyBudgets : bool option;
    LifetimeSpendCap : int option;
    Name : string;
    OrderLineId : string option;
    StartTime : int option;
    Status : EntityStatus;
    TrackingUrls : TrackingUrls;
    DefaultAdGroupBudgetInMicroCurrency : int option;
    IsCampaignBudgetOptimization : bool option;
    Id : string;
    BidOptions : CampaignBidOptions;
    CreatedTime : int;
    IsPerformancePlus : bool;
    ObjectiveType : ObjectiveType;
    SummaryStatus : CampaignSummaryStatus;
    Type : string;
    UpdatedTime : int;
  }
  //#endregion
