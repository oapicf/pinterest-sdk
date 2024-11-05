namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperationStatus
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.CreativeAssetsProcessingRecord

module CatalogsCreativeAssetsItemsBatch =

  //#region CatalogsCreativeAssetsItemsBatch


  type CatalogsCreativeAssetsItemsBatch = {
    BatchId : string;
    CreatedTime : Nullable<DateTime>;
    CompletedTime : Nullable<DateTime>;
    Status : BatchOperationStatus;
    CatalogType : CatalogsType;
    Items : CreativeAssetsProcessingRecord[];
  }
  //#endregion
