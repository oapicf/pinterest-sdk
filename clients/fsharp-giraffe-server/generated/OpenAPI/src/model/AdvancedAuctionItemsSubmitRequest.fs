namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdvancedAuctionItemsSubmitRecord

module AdvancedAuctionItemsSubmitRequest =

  //#region AdvancedAuctionItemsSubmitRequest


  type AdvancedAuctionItemsSubmitRequest = {
    CatalogId : string;
    Items : AdvancedAuctionItemsSubmitRecord[];
  }
  //#endregion
