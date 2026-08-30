namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchOperationStatus
open OpenAPI.Model.ItemProcessingRecord

module CatalogsRetailItemsBatch =

  //#region CatalogsRetailItemsBatch

  [<CLIMutable>]
  type CatalogsRetailItemsBatch = {
    [<JsonProperty(PropertyName = "batch_id")>]
    BatchId : string;
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "completed_time")>]
    CompletedTime : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : DateTime;
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemProcessingRecord[];
    [<JsonProperty(PropertyName = "status")>]
    Status : BatchOperationStatus;
  }

  //#endregion
