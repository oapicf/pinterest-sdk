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
    CatalogType : CatalogsType;
    CompletedTime : Nullable<DateTime>;
    CreatedTime : Nullable<DateTime>;
    Items : CreativeAssetsProcessingRecord[];
    Status : BatchOperationStatus;
  }
  //#endregion
