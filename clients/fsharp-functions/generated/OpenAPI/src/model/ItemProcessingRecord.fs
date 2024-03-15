namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemProcessingStatus
open OpenAPI.Model.ItemValidationEvent

module ItemProcessingRecord =

  //#region ItemProcessingRecord

  [<CLIMutable>]
  type ItemProcessingRecord = {
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : ItemValidationEvent[];
    [<JsonProperty(PropertyName = "warnings")>]
    Warnings : ItemValidationEvent[];
    [<JsonProperty(PropertyName = "status")>]
    Status : ItemProcessingStatus;
  }

  //#endregion
