namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PerformancePlusCampaignSettings =

  //#region PerformancePlusCampaignSettings

  [<CLIMutable>]
  type PerformancePlusCampaignSettings = {
    [<JsonProperty(PropertyName = "boost_prospecting_ad_group_bid")>]
    BoostProspectingAdGroupBid : bool;
    [<JsonProperty(PropertyName = "pinner_list_exclusions")>]
    PinnerListExclusions : string[];
  }

  //#endregion
