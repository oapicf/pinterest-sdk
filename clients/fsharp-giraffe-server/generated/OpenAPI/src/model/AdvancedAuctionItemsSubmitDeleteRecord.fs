namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdvancedAuctionOperationError
open OpenAPI.Model.Country
open OpenAPI.Model.Language

module AdvancedAuctionItemsSubmitDeleteRecord =

  //#region AdvancedAuctionItemsSubmitDeleteRecord


  type AdvancedAuctionItemsSubmitDeleteRecord = {
    Country : Country;
    ItemId : string;
    Language : Language;
    Errors : AdvancedAuctionOperationError[];
  }
  //#endregion
