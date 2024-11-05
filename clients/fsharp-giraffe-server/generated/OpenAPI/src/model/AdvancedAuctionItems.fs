namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdvancedAuctionItem

module AdvancedAuctionItems =

  //#region AdvancedAuctionItems


  type AdvancedAuctionItems = {
    CatalogId : string;
    Items : AdvancedAuctionItem[];
  }
  //#endregion
