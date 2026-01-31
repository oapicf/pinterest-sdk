namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperationStatus
open OpenAPI.Model.CatalogsCreativeAssetsItemsBatch
open OpenAPI.Model.CatalogsHotelItemsBatch
open OpenAPI.Model.CatalogsRetailItemsBatch
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.CreativeAssetsProcessingRecord

module CatalogsItemsBatch =

  //#region CatalogsItemsBatch


  type CatalogsItemsBatch = {
    CatalogType : CatalogsType;
    BatchId : string;
    CompletedTime : Nullable<DateTime>;
    CreatedTime : DateTime;
    Items : CreativeAssetsProcessingRecord[];
    Status : BatchOperationStatus;
  }
  //#endregion
