namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdvancedAuctionBidOptions
open OpenAPI.Model.AdvancedAuctionOperationError
open OpenAPI.Model.Country
open OpenAPI.Model.Language
open OpenAPI.Model.UpdateMaskBidOptionField

module AdvancedAuctionItemsSubmitUpsertRecord =

  //#region AdvancedAuctionItemsSubmitUpsertRecord


  type AdvancedAuctionItemsSubmitUpsertRecord = {
    Country : Country;
    ItemId : string;
    Language : Language;
    BidOptions : AdvancedAuctionBidOptions;
    Errors : AdvancedAuctionOperationError[];
    UpdateMask : UpdateMaskBidOptionField[];
  }
  //#endregion
