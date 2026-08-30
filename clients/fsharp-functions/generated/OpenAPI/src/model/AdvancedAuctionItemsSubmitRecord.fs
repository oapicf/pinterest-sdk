namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdvancedAuctionBidOptions
open OpenAPI.Model.AdvancedAuctionItemsSubmitDeleteRecord
open OpenAPI.Model.AdvancedAuctionItemsSubmitUpsertRecord
open OpenAPI.Model.AdvancedAuctionOperationError
open OpenAPI.Model.Country
open OpenAPI.Model.Language
open OpenAPI.Model.UpdateMaskBidOptionField

module AdvancedAuctionItemsSubmitRecord =

  //#region AdvancedAuctionItemsSubmitRecord

  [<CLIMutable>]
  type AdvancedAuctionItemsSubmitRecord = {
    [<JsonProperty(PropertyName = "bid_options")>]
    BidOptions : AdvancedAuctionBidOptions;
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
    [<JsonProperty(PropertyName = "update_mask")>]
    UpdateMask : UpdateMaskBidOptionField[];
  }

  //#endregion
