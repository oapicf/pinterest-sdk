namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperationStatus
open OpenAPI.Model.HotelProcessingRecord

module CatalogsHotelItemsBatch =

  //#region CatalogsHotelItemsBatch

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsHotelItemsBatch = {
    BatchId : string;
    CatalogType : CatalogTypeEnum;
    CompletedTime : Nullable<DateTime>;
    CreatedTime : Nullable<DateTime>;
    Items : HotelProcessingRecord[];
    Status : BatchOperationStatus;
  }
  //#endregion
