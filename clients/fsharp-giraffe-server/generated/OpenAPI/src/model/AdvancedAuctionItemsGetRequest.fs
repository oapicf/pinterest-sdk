namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdvancedAuctionItemsGetRecord

module AdvancedAuctionItemsGetRequest =

  //#region AdvancedAuctionItemsGetRequest


  type AdvancedAuctionItemsGetRequest = {
    CatalogId : string;
    Items : AdvancedAuctionItemsGetRecord[];
  }
  //#endregion
