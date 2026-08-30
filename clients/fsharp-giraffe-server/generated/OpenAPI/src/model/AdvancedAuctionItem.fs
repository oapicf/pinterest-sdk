namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdvancedAuctionBidOptions
open OpenAPI.Model.Country
open OpenAPI.Model.Language

module AdvancedAuctionItem =

  //#region AdvancedAuctionItem


  type AdvancedAuctionItem = {
    BidOptions : AdvancedAuctionBidOptions;
    Country : Country;
    ItemId : string;
    Language : Language;
  }
  //#endregion
