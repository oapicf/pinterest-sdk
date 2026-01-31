namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.bool option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CampaignCommon =

  //#region CampaignCommon


  type CampaignCommon = {
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
  }
  //#endregion
