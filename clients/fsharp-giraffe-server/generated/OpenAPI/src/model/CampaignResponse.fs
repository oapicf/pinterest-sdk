namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignCommon
open OpenAPI.Model.CampaignResponseAllOf
open OpenAPI.Model.CampaignResponseAllOf1
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.ObjectiveType
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CampaignResponse =

  //#region CampaignResponse


  type CampaignResponse = {
    Id : string;
    AdAccountId : string;
    Name : string;
    Status : EntityStatus;
    LifetimeSpendCap : int option;
    DailySpendCap : int option;
    OrderLineId : string option;
    TrackingUrls : TrackingUrls;
    StartTime : int option;
    EndTime : int option;
    ObjectiveType : ObjectiveType;
    CreatedTime : int;
    UpdatedTime : int;
    Type : string;
  }
  //#endregion
