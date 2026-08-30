namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdvancedAuctionBidOptions
open OpenAPI.Model.AdvancedAuctionItemsSubmitDeleteRecord
open OpenAPI.Model.AdvancedAuctionItemsSubmitUpsertRecord
open OpenAPI.Model.AdvancedAuctionOperationError
open OpenAPI.Model.Country
open OpenAPI.Model.Language
open OpenAPI.Model.UpdateMaskBidOptionField

module AdvancedAuctionItemsSubmitRecord =

  //#region AdvancedAuctionItemsSubmitRecord

  //#region enums
  type OperationEnum = DELETEEnum of string  
  //#endregion

  type AdvancedAuctionItemsSubmitRecord = {
    BidOptions : AdvancedAuctionBidOptions;
    Country : Country;
    Errors : AdvancedAuctionOperationError[];
    ItemId : string;
    Language : Language;
    Operation : OperationEnum;
    UpdateMask : UpdateMaskBidOptionField[];
  }
  //#endregion
