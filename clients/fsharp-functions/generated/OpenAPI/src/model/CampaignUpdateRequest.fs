namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdCommonTrackingUrls
open OpenAPI.Model.CampaignSummaryStatus
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.ObjectiveType
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CampaignUpdateRequest =

  //#region CampaignUpdateRequest

  [<CLIMutable>]
  type CampaignUpdateRequest = {
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
    TrackingUrls : AdCommonTrackingUrls;
    [<JsonProperty(PropertyName = "start_time")>]
    StartTime : int option;
    [<JsonProperty(PropertyName = "end_time")>]
    EndTime : int option;
    [<JsonProperty(PropertyName = "summary_status")>]
    SummaryStatus : CampaignSummaryStatus;
    [<JsonProperty(PropertyName = "is_flexible_daily_budgets")>]
    IsFlexibleDailyBudgets : bool;
    [<JsonProperty(PropertyName = "default_ad_group_budget_in_micro_currency")>]
    DefaultAdGroupBudgetInMicroCurrency : int option;
    [<JsonProperty(PropertyName = "is_automated_campaign")>]
    IsAutomatedCampaign : bool;
    [<JsonProperty(PropertyName = "is_campaign_budget_optimization")>]
    IsCampaignBudgetOptimization : bool;
    [<JsonProperty(PropertyName = "objective_type")>]
    ObjectiveType : ObjectiveType;
  }

  //#endregion
