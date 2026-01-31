namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemProcessingStatus
open OpenAPI.Model.ItemValidationEvent

module ItemProcessingRecord =

  //#region ItemProcessingRecord


  type ItemProcessingRecord = {
    Errors : ItemValidationEvent[];
    ItemId : string;
    Status : ItemProcessingStatus;
    Warnings : ItemValidationEvent[];
  }
  //#endregion
