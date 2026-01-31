namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Country
open OpenAPI.Model.Language

module AdvancedAuctionKey =

  //#region AdvancedAuctionKey


  type AdvancedAuctionKey = {
    Country : Country;
    ItemId : string;
    Language : Language;
  }
  //#endregion
