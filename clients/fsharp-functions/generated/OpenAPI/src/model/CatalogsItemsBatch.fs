namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchOperationStatus
open OpenAPI.Model.ItemProcessingRecord

module CatalogsItemsBatch =

  //#region CatalogsItemsBatch

  [<CLIMutable>]
  type CatalogsItemsBatch = {
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemProcessingRecord[];
    [<JsonProperty(PropertyName = "batch_id")>]
    BatchId : string;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "completed_time")>]
    CompletedTime : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "status")>]
    Status : BatchOperationStatus;
  }

  //#endregion
