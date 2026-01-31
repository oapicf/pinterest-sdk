namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchOperationStatus
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.HotelProcessingRecord

module CatalogsHotelItemsBatch =

  //#region CatalogsHotelItemsBatch

  [<CLIMutable>]
  type CatalogsHotelItemsBatch = {
    [<JsonProperty(PropertyName = "batch_id")>]
    BatchId : string;
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "completed_time")>]
    CompletedTime : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "items")>]
    Items : HotelProcessingRecord[];
    [<JsonProperty(PropertyName = "status")>]
    Status : BatchOperationStatus;
  }

  //#endregion
