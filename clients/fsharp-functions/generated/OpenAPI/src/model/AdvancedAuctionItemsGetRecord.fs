namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Country
open OpenAPI.Model.Language

module AdvancedAuctionItemsGetRecord =

  //#region AdvancedAuctionItemsGetRecord

  [<CLIMutable>]
  type AdvancedAuctionItemsGetRecord = {
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : Language;
  }

  //#endregion
