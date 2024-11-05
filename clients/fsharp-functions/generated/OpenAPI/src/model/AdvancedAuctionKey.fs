namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Country
open OpenAPI.Model.Language

module AdvancedAuctionKey =

  //#region AdvancedAuctionKey

  [<CLIMutable>]
  type AdvancedAuctionKey = {
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "language")>]
    Language : Language;
  }

  //#endregion
