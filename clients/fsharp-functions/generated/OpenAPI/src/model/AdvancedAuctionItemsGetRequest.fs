namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdvancedAuctionItemsGetRecord

module AdvancedAuctionItemsGetRequest =

  //#region AdvancedAuctionItemsGetRequest

  [<CLIMutable>]
  type AdvancedAuctionItemsGetRequest = {
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "items")>]
    Items : AdvancedAuctionItemsGetRecord[];
  }

  //#endregion
