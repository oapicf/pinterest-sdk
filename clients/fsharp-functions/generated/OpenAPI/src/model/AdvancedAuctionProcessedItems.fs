namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdvancedAuctionProcessedItem

module AdvancedAuctionProcessedItems =

  //#region AdvancedAuctionProcessedItems

  [<CLIMutable>]
  type AdvancedAuctionProcessedItems = {
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "items")>]
    Items : AdvancedAuctionProcessedItem[];
  }

  //#endregion
