namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdvancedAuctionBidOptions
open OpenAPI.Model.Country
open OpenAPI.Model.Language

module AdvancedAuctionItem =

  //#region AdvancedAuctionItem

  [<CLIMutable>]
  type AdvancedAuctionItem = {
    [<JsonProperty(PropertyName = "bid_options")>]
    BidOptions : AdvancedAuctionBidOptions;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : Language;
  }

  //#endregion
