namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.SupplementalItemBatchOperationStatus
open OpenAPI.Model.SupplementalOperationResult

module SupplementalItemsBatchResponse =

  //#region SupplementalItemsBatchResponse


  type SupplementalItemsBatchResponse = {
    BatchId : string;
    CompletedTime : Nullable<DateTime>;
    CreatedTime : DateTime;
    OperationResults : SupplementalOperationResult[];
    Status : SupplementalItemBatchOperationStatus;
  }
  //#endregion
