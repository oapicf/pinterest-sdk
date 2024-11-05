namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchOperationStatus
open OpenAPI.Model.CatalogsCreativeAssetsItemsBatch
open OpenAPI.Model.CatalogsHotelItemsBatch
open OpenAPI.Model.CatalogsRetailItemsBatch
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.CreativeAssetsProcessingRecord

module CatalogsItemsBatch =

  //#region CatalogsItemsBatch

  [<CLIMutable>]
  type CatalogsItemsBatch = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "batch_id")>]
    BatchId : string;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "completed_time")>]
    CompletedTime : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "status")>]
    Status : BatchOperationStatus;
    [<JsonProperty(PropertyName = "items")>]
    Items : CreativeAssetsProcessingRecord[];
  }

  //#endregion
