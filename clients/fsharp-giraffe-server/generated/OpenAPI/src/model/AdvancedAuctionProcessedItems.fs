namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdvancedAuctionProcessedItem

module AdvancedAuctionProcessedItems =

  //#region AdvancedAuctionProcessedItems


  type AdvancedAuctionProcessedItems = {
    CatalogId : string;
    Items : AdvancedAuctionProcessedItem[];
  }
  //#endregion
