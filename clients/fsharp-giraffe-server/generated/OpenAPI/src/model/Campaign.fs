namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignBidOptions
open OpenAPI.Model.CampaignObjectiveType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.IntendedPromotionType
open OpenAPI.Model.PerformancePlusCampaignSettings
open OpenAPI.Model.SummaryStatus
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.bool option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module Campaign =

  //#region Campaign


  type Campaign = {
    AdAccountId : string;
    BidOptions : CampaignBidOptions;
    CreatedTime : int;
    DailySpendCap : int option;
    DefaultAdGroupBudgetInMicroCurrency : int option;
    EndTime : int option;
    Id : string;
    IntendedPromotionType : IntendedPromotionType;
    IsAutomatedCampaign : bool option;
    IsCampaignBudgetOptimization : bool option;
    IsCarting : bool;
    IsFlexibleDailyBudgets : bool option;
    IsLtvOptimized : bool;
    IsPerformancePlus : bool;
    IsTopOfSearch : bool;
    LifetimeSpendCap : int option;
    Name : string;
    ObjectiveType : CampaignObjectiveType;
    OrderLineId : string option;
    PerformancePlusCampaignSettings : PerformancePlusCampaignSettings;
    StartTime : int option;
    Status : EntityStatus;
    SummaryStatus : SummaryStatus;
    TrackingUrls : TrackingUrls;
    Type : string;
    UpdatedTime : int;
  }
  //#endregion
