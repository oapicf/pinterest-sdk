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
    CreatedTime : Nullable<DateTime>;
    CompletedTime : Nullable<DateTime>;
    Status : BatchOperationStatus;
    CatalogType : CatalogsType;
    Items : HotelProcessingRecord[];
  }
  //#endregion
