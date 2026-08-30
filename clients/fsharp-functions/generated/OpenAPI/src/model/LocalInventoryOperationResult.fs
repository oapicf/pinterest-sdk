namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.SupplementalItemProcessingStatus
open OpenAPI.Model.SupplementalItemValidationEvent

module LocalInventoryOperationResult =

  //#region LocalInventoryOperationResult

  [<CLIMutable>]
  type LocalInventoryOperationResult = {
    [<JsonProperty(PropertyName = "errors")>]
    Errors : SupplementalItemValidationEvent[];
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : SupplementalItemProcessingStatus;
    [<JsonProperty(PropertyName = "store_code")>]
    StoreCode : string;
    [<JsonProperty(PropertyName = "supplemental_type")>]
    SupplementalType : string;
    [<JsonProperty(PropertyName = "warnings")>]
    Warnings : SupplementalItemValidationEvent[];
  }

  //#endregion
