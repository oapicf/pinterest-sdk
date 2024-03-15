namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchOperationStatus
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.ItemProcessingRecord

module CatalogsRetailItemsBatch =

  //#region CatalogsRetailItemsBatch

  [<CLIMutable>]
  type CatalogsRetailItemsBatch = {
    [<JsonProperty(PropertyName = "batch_id")>]
    BatchId : string;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "completed_time")>]
    CompletedTime : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "status")>]
    Status : BatchOperationStatus;
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemProcessingRecord[];
  }

  //#endregion
