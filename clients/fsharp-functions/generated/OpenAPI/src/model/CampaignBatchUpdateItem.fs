namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignBidOptionsUpdate
open OpenAPI.Model.ConversionObjectiveType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.IntendedPromotionType
open OpenAPI.Model.MobileAppPlatform
open OpenAPI.Model.PerformancePlusCampaignSettings
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.bool option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CampaignBatchUpdateItem =

  //#region CampaignBatchUpdateItem

  [<CLIMutable>]
  type CampaignBatchUpdateItem = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "app_id")>]
    AppId : string;
    [<JsonProperty(PropertyName = "app_platform")>]
    AppPlatform : MobileAppPlatform;
    [<JsonProperty(PropertyName = "bid_options")>]
    BidOptions : CampaignBidOptionsUpdate;
    [<JsonProperty(PropertyName = "daily_spend_cap")>]
    DailySpendCap : int option;
    [<JsonProperty(PropertyName = "default_ad_group_budget_in_micro_currency")>]
    DefaultAdGroupBudgetInMicroCurrency : int option;
    [<JsonProperty(PropertyName = "end_time")>]
    EndTime : int option;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "intended_promotion_type")>]
    IntendedPromotionType : IntendedPromotionType;
    [<JsonProperty(PropertyName = "is_automated_campaign")>]
    IsAutomatedCampaign : bool option;
    [<JsonProperty(PropertyName = "is_campaign_budget_optimization")>]
    IsCampaignBudgetOptimization : bool option;
    [<JsonProperty(PropertyName = "is_flexible_daily_budgets")>]
    IsFlexibleDailyBudgets : bool option;
    [<JsonProperty(PropertyName = "is_ltv_optimized")>]
    IsLtvOptimized : bool;
    [<JsonProperty(PropertyName = "is_performance_plus")>]
    IsPerformancePlus : bool;
    [<JsonProperty(PropertyName = "is_top_of_search")>]
    IsTopOfSearch : bool;
    [<JsonProperty(PropertyName = "lifetime_spend_cap")>]
    LifetimeSpendCap : int option;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "objective_type")>]
    ObjectiveType : ConversionObjectiveType;
    [<JsonProperty(PropertyName = "order_line_id")>]
    OrderLineId : string option;
    [<JsonProperty(PropertyName = "performance_plus_campaign_settings")>]
    PerformancePlusCampaignSettings : PerformancePlusCampaignSettings;
    [<JsonProperty(PropertyName = "start_time")>]
    StartTime : int option;
    [<JsonProperty(PropertyName = "status")>]
    Status : EntityStatus;
    [<JsonProperty(PropertyName = "tracking_urls")>]
    TrackingUrls : TrackingUrls;
  }

  //#endregion
