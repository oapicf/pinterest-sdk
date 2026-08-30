namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignBidOptionsUpdate
open OpenAPI.Model.IntendedPromotionType
open OpenAPI.Model.ObjectiveType

module CampaignUpdateRequestAllOf2 =

  //#region CampaignUpdateRequestAllOf2


  type CampaignUpdateRequestAllOf2 = {
    BidOptions : CampaignBidOptionsUpdate;
    IntendedPromotionType : IntendedPromotionType;
    IsLtvOptimized : bool;
    IsPerformancePlus : bool;
    IsTopOfSearch : bool;
    ObjectiveType : ObjectiveType;
  }
  //#endregion
