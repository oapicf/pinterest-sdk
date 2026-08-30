namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignBidOptionsCreate
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.IntendedPromotionType
open OpenAPI.Model.ObjectiveType
open OpenAPI.Model.bool option

module CampaignCreateRequestAllOf1 =

  //#region CampaignCreateRequestAllOf1


  type CampaignCreateRequestAllOf1 = {
    BidOptions : CampaignBidOptionsCreate;
    IntendedPromotionType : IntendedPromotionType;
    IsAutomatedCampaign : bool option;
    IsCampaignBudgetOptimization : bool option;
    IsFlexibleDailyBudgets : bool option;
    IsLtvOptimized : bool;
    IsPerformancePlus : bool;
    IsTopOfSearch : bool;
    ObjectiveType : ObjectiveType;
    Status : EntityStatus;
  }
  //#endregion
