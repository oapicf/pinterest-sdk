namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.SupplementalItemBatchOperationStatus
open OpenAPI.Model.SupplementalOperationResult

module SupplementalItemsBatchResponse =

  //#region SupplementalItemsBatchResponse

  [<CLIMutable>]
  type SupplementalItemsBatchResponse = {
    [<JsonProperty(PropertyName = "batch_id")>]
    BatchId : string;
    [<JsonProperty(PropertyName = "completed_time")>]
    CompletedTime : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : DateTime;
    [<JsonProperty(PropertyName = "operation_results")>]
    OperationResults : SupplementalOperationResult[];
    [<JsonProperty(PropertyName = "status")>]
    Status : SupplementalItemBatchOperationStatus;
  }

  //#endregion
