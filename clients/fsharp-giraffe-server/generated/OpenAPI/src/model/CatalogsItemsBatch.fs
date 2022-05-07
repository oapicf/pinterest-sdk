namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperationStatus
open OpenAPI.Model.ItemProcessingRecord

module CatalogsItemsBatch =

  //#region CatalogsItemsBatch


  type CatalogsItemsBatch = {
    Items : ItemProcessingRecord[];
    BatchId : string;
    CreatedTime : Nullable<DateTime>;
    CompletedTime : Nullable<DateTime>;
    Status : BatchOperationStatus;
  }
  //#endregion
