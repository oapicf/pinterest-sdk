namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdvancedAuctionItem

module AdvancedAuctionItems =

  //#region AdvancedAuctionItems

  [<CLIMutable>]
  type AdvancedAuctionItems = {
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "items")>]
    Items : AdvancedAuctionItem[];
  }

  //#endregion
