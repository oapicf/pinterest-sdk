namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperationStatus
open OpenAPI.Model.CreativeAssetsProcessingRecord

module CatalogsCreativeAssetsItemsBatch =

  //#region CatalogsCreativeAssetsItemsBatch

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsCreativeAssetsItemsBatch = {
    BatchId : string;
    CatalogType : CatalogTypeEnum;
    CompletedTime : Nullable<DateTime>;
    CreatedTime : Nullable<DateTime>;
    Items : CreativeAssetsProcessingRecord[];
    Status : BatchOperationStatus;
  }
  //#endregion
