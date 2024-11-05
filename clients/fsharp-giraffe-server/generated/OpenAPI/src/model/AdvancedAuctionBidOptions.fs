namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AppTypeMultipliers
open OpenAPI.Model.PlacementMultipliers

module AdvancedAuctionBidOptions =

  //#region AdvancedAuctionBidOptions


  type AdvancedAuctionBidOptions = {
    BidInMicroCurrency : int64;
    AppTypeMultipliers : AppTypeMultipliers;
    PlacementMultipliers : PlacementMultipliers;
  }
  //#endregion
