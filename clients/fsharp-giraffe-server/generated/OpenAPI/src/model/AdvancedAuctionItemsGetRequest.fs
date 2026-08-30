namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdvancedAuctionKey

module AdvancedAuctionItemsGetRequest =

  //#region AdvancedAuctionItemsGetRequest


  type AdvancedAuctionItemsGetRequest = {
    CatalogId : string;
    Items : AdvancedAuctionKey[];
  }
  //#endregion
