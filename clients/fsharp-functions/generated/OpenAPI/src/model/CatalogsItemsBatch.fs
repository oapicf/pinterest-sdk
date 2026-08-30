namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchOperationStatus
open OpenAPI.Model.CatalogsCreativeAssetsItemsBatch
open OpenAPI.Model.CatalogsHotelItemsBatch
open OpenAPI.Model.CatalogsRetailItemsBatch
open OpenAPI.Model.CreativeAssetsProcessingRecord

module CatalogsItemsBatch =

  //#region CatalogsItemsBatch

  [<CLIMutable>]
  type CatalogsItemsBatch = {
    [<JsonProperty(PropertyName = "batch_id")>]
    BatchId : string;
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "completed_time")>]
    CompletedTime : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : DateTime;
    [<JsonProperty(PropertyName = "items")>]
    Items : CreativeAssetsProcessingRecord[];
    [<JsonProperty(PropertyName = "status")>]
    Status : BatchOperationStatus;
  }

  //#endregion
