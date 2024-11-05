namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Country
open OpenAPI.Model.Language

module AdvancedAuctionItemsGetRecord =

  //#region AdvancedAuctionItemsGetRecord


  type AdvancedAuctionItemsGetRecord = {
    ItemId : string;
    Country : Country;
    Language : Language;
  }
  //#endregion
