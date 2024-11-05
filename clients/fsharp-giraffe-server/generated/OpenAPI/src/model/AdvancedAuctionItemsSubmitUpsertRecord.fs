namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdvancedAuctionBidOptions
open OpenAPI.Model.Country
open OpenAPI.Model.Language
open OpenAPI.Model.UpdateMaskBidOptionField

module AdvancedAuctionItemsSubmitUpsertRecord =

  //#region AdvancedAuctionItemsSubmitUpsertRecord


  type AdvancedAuctionItemsSubmitUpsertRecord = {
    ItemId : string;
    Country : Country;
    Language : Language;
    BidOptions : AdvancedAuctionBidOptions;
    UpdateMask : UpdateMaskBidOptionField[];
  }
  //#endregion
