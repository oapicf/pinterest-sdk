namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdvancedAuctionItemsSubmitRecord

module AdvancedAuctionItemsSubmitRequest =

  //#region AdvancedAuctionItemsSubmitRequest

  [<CLIMutable>]
  type AdvancedAuctionItemsSubmitRequest = {
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "items")>]
    Items : AdvancedAuctionItemsSubmitRecord[];
  }

  //#endregion
