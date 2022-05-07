namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
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

  [<CLIMutable>]
  type CampaignResponse = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : EntityStatus;
    [<JsonProperty(PropertyName = "lifetime_spend_cap")>]
    LifetimeSpendCap : int option;
    [<JsonProperty(PropertyName = "daily_spend_cap")>]
    DailySpendCap : int option;
    [<JsonProperty(PropertyName = "order_line_id")>]
    OrderLineId : string option;
    [<JsonProperty(PropertyName = "tracking_urls")>]
    TrackingUrls : TrackingUrls;
    [<JsonProperty(PropertyName = "start_time")>]
    StartTime : int option;
    [<JsonProperty(PropertyName = "end_time")>]
    EndTime : int option;
    [<JsonProperty(PropertyName = "objective_type")>]
    ObjectiveType : ObjectiveType;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int;
    [<JsonProperty(PropertyName = "updated_time")>]
    UpdatedTime : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
