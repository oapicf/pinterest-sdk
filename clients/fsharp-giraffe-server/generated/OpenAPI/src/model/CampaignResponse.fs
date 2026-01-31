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

module CampaignResponse =

  //#region CampaignResponse


  type CampaignResponse = {
    Id : string;
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
    BidOptions : CampaignBidOptions;
    CreatedTime : int;
    IsCampaignBudgetOptimization : bool option;
    IsPerformancePlus : bool;
    ObjectiveType : ObjectiveType;
    SummaryStatus : CampaignSummaryStatus;
    Type : string;
    UpdatedTime : int;
  }
  //#endregion
