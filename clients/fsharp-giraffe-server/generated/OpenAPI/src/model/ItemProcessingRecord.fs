namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemProcessingStatus
open OpenAPI.Model.ItemValidationEvent

module ItemProcessingRecord =

  //#region ItemProcessingRecord


  type ItemProcessingRecord = {
    ItemId : string;
    Errors : ItemValidationEvent[];
    Warnings : ItemValidationEvent[];
    Status : ItemProcessingStatus;
  }
  //#endregion
