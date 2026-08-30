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

  //#region enums
  type OperationEnum = UPSERTEnum of string  
  //#endregion

  type AdvancedAuctionItemsSubmitUpsertRecord = {
    BidOptions : AdvancedAuctionBidOptions;
    Country : Country;
    Errors : AdvancedAuctionOperationError[];
    ItemId : string;
    Language : Language;
    Operation : OperationEnum;
    UpdateMask : UpdateMaskBidOptionField[];
  }
  //#endregion
