namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdvancedAuctionOperationError
open OpenAPI.Model.Country
open OpenAPI.Model.Language

module AdvancedAuctionItemsSubmitDeleteRecord =

  //#region AdvancedAuctionItemsSubmitDeleteRecord

  [<CLIMutable>]
  type AdvancedAuctionItemsSubmitDeleteRecord = {
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : AdvancedAuctionOperationError[];
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : Language;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
  }

  //#endregion
