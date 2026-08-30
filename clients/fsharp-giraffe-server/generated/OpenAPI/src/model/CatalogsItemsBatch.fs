namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperationStatus
open OpenAPI.Model.CatalogsCreativeAssetsItemsBatch
open OpenAPI.Model.CatalogsHotelItemsBatch
open OpenAPI.Model.CatalogsRetailItemsBatch
open OpenAPI.Model.CreativeAssetsProcessingRecord

module CatalogsItemsBatch =

  //#region CatalogsItemsBatch

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsItemsBatch = {
    BatchId : string;
    CatalogType : CatalogTypeEnum;
    CompletedTime : Nullable<DateTime>;
    CreatedTime : DateTime;
    Items : CreativeAssetsProcessingRecord[];
    Status : BatchOperationStatus;
  }
  //#endregion
