namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperationStatus
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.HotelProcessingRecord

module CatalogsHotelItemsBatch =

  //#region CatalogsHotelItemsBatch


  type CatalogsHotelItemsBatch = {
    BatchId : string;
    CatalogType : CatalogsType;
    CompletedTime : Nullable<DateTime>;
    CreatedTime : Nullable<DateTime>;
    Items : HotelProcessingRecord[];
    Status : BatchOperationStatus;
  }
  //#endregion
