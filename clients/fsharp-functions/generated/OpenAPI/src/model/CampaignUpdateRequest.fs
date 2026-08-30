namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignBidOptionsUpdate
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.IntendedPromotionType
open OpenAPI.Model.ObjectiveType
open OpenAPI.Model.bool option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CampaignUpdateRequest =

  //#region CampaignUpdateRequest

  [<CLIMutable>]
  type CampaignUpdateRequest = {
    [<JsonProperty(PropertyName = "bid_options")>]
    BidOptions : CampaignBidOptionsUpdate;
    [<JsonProperty(PropertyName = "intended_promotion_type")>]
    IntendedPromotionType : IntendedPromotionType;
    [<JsonProperty(PropertyName = "is_ltv_optimized")>]
    IsLtvOptimized : bool;
    [<JsonProperty(PropertyName = "is_performance_plus")>]
    IsPerformancePlus : bool;
    [<JsonProperty(PropertyName = "is_top_of_search")>]
    IsTopOfSearch : bool;
    [<JsonProperty(PropertyName = "objective_type")>]
    ObjectiveType : ObjectiveType;
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "daily_spend_cap")>]
    DailySpendCap : int option;
    [<JsonProperty(PropertyName = "default_ad_group_budget_in_micro_currency")>]
    DefaultAdGroupBudgetInMicroCurrency : int option;
    [<JsonProperty(PropertyName = "end_time")>]
    EndTime : int option;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "is_automated_campaign")>]
    IsAutomatedCampaign : bool option;
    [<JsonProperty(PropertyName = "is_campaign_budget_optimization")>]
    IsCampaignBudgetOptimization : bool option;
    [<JsonProperty(PropertyName = "is_flexible_daily_budgets")>]
    IsFlexibleDailyBudgets : bool option;
    [<JsonProperty(PropertyName = "lifetime_spend_cap")>]
    LifetimeSpendCap : int option;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "order_line_id")>]
    OrderLineId : string option;
    [<JsonProperty(PropertyName = "start_time")>]
    StartTime : int option;
    [<JsonProperty(PropertyName = "status")>]
    Status : EntityStatus;
    [<JsonProperty(PropertyName = "tracking_urls")>]
    TrackingUrls : obj;
  }

  //#endregion
