namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignBidOptionsUpdate
open OpenAPI.Model.IntendedPromotionType
open OpenAPI.Model.ObjectiveType

module CampaignUpdateRequestAllOf2 =

  //#region CampaignUpdateRequestAllOf2

  [<CLIMutable>]
  type CampaignUpdateRequestAllOf2 = {
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
  }

  //#endregion
