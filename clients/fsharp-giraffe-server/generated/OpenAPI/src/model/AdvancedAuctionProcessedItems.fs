namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdvancedAuctionItemsSubmitRecord

module AdvancedAuctionProcessedItems =

  //#region AdvancedAuctionProcessedItems


  type AdvancedAuctionProcessedItems = {
    CatalogId : string;
    Items : AdvancedAuctionItemsSubmitRecord[];
  }
  //#endregion
