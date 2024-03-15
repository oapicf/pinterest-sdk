namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperationStatus
open OpenAPI.Model.CatalogsHotelItemsBatch
open OpenAPI.Model.CatalogsRetailItemsBatch
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.HotelProcessingRecord

module CatalogsItemsBatch =

  //#region CatalogsItemsBatch


  type CatalogsItemsBatch = {
    CatalogType : CatalogsType;
    BatchId : string;
    CreatedTime : Nullable<DateTime>;
    CompletedTime : Nullable<DateTime>;
    Status : BatchOperationStatus;
    Items : HotelProcessingRecord[];
  }
  //#endregion
