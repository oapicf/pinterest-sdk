namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Country
open OpenAPI.Model.Language

module AdvancedAuctionItemsSubmitDeleteRecord =

  //#region AdvancedAuctionItemsSubmitDeleteRecord


  type AdvancedAuctionItemsSubmitDeleteRecord = {
    ItemId : string;
    Country : Country;
    Language : Language;
  }
  //#endregion
