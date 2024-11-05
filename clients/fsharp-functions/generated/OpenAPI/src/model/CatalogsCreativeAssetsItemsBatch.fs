namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchOperationStatus
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.CreativeAssetsProcessingRecord

module CatalogsCreativeAssetsItemsBatch =

  //#region CatalogsCreativeAssetsItemsBatch

  [<CLIMutable>]
  type CatalogsCreativeAssetsItemsBatch = {
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
    Items : CreativeAssetsProcessingRecord[];
  }

  //#endregion
