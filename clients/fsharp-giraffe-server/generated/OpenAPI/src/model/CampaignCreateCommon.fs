namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.bool option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CampaignCreateCommon =

  //#region CampaignCreateCommon


  type CampaignCreateCommon = {
    AdAccountId : string;
    Name : string;
    Status : EntityStatus;
    LifetimeSpendCap : int option;
    DailySpendCap : int option;
    OrderLineId : string option;
    TrackingUrls : TrackingUrls;
    StartTime : int option;
    EndTime : int option;
    IsFlexibleDailyBudgets : bool option;
    DefaultAdGroupBudgetInMicroCurrency : int option;
    IsAutomatedCampaign : bool option;
  }
  //#endregion
