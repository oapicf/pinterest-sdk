namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AppTypeMultipliers
open OpenAPI.Model.PlacementMultipliers

module AdvancedAuctionBidOptions =

  //#region AdvancedAuctionBidOptions

  [<CLIMutable>]
  type AdvancedAuctionBidOptions = {
    [<JsonProperty(PropertyName = "bid_in_micro_currency")>]
    BidInMicroCurrency : int64;
    [<JsonProperty(PropertyName = "app_type_multipliers")>]
    AppTypeMultipliers : AppTypeMultipliers;
    [<JsonProperty(PropertyName = "placement_multipliers")>]
    PlacementMultipliers : PlacementMultipliers;
  }

  //#endregion
