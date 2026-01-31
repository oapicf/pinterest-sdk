namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdvancedAuctionBidOptions
open OpenAPI.Model.AdvancedAuctionItemsSubmitDeleteRecord
open OpenAPI.Model.AdvancedAuctionItemsSubmitUpsertRecord
open OpenAPI.Model.AdvancedAuctionOperation
open OpenAPI.Model.AdvancedAuctionOperationError
open OpenAPI.Model.Country
open OpenAPI.Model.Language
open OpenAPI.Model.UpdateMaskBidOptionField

module AdvancedAuctionItemsSubmitRecord =

  //#region AdvancedAuctionItemsSubmitRecord


  type AdvancedAuctionItemsSubmitRecord = {
    Operation : AdvancedAuctionOperation;
    Country : Country;
    ItemId : string;
    Language : Language;
    BidOptions : AdvancedAuctionBidOptions;
    Errors : AdvancedAuctionOperationError[];
    UpdateMask : UpdateMaskBidOptionField[];
  }
  //#endregion
