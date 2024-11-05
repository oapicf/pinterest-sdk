namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdvancedAuctionBidOptions
open OpenAPI.Model.AdvancedAuctionItemsSubmitRecord
open OpenAPI.Model.AdvancedAuctionOperation
open OpenAPI.Model.AdvancedAuctionOperationError
open OpenAPI.Model.Country
open OpenAPI.Model.Language
open OpenAPI.Model.UpdateMaskBidOptionField

module AdvancedAuctionProcessedItem =

  //#region AdvancedAuctionProcessedItem

  [<CLIMutable>]
  type AdvancedAuctionProcessedItem = {
    [<JsonProperty(PropertyName = "errors")>]
    Errors : AdvancedAuctionOperationError[];
  }

  //#endregion
