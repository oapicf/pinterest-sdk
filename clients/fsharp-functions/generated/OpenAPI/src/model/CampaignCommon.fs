namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdCommonTrackingUrls
open OpenAPI.Model.CampaignSummaryStatus
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CampaignCommon =

  //#region CampaignCommon

  [<CLIMutable>]
  type CampaignCommon = {
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
    TrackingUrls : AdCommonTrackingUrls;
    [<JsonProperty(PropertyName = "start_time")>]
    StartTime : int option;
    [<JsonProperty(PropertyName = "end_time")>]
    EndTime : int option;
    [<JsonProperty(PropertyName = "summary_status")>]
    SummaryStatus : CampaignSummaryStatus;
  }

  //#endregion
