namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperationStatus
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.ItemProcessingRecord

module CatalogsRetailItemsBatch =

  //#region CatalogsRetailItemsBatch


  type CatalogsRetailItemsBatch = {
    BatchId : string;
    CreatedTime : Nullable<DateTime>;
    CompletedTime : Nullable<DateTime>;
    Status : BatchOperationStatus;
    CatalogType : CatalogsType;
    Items : ItemProcessingRecord[];
  }
  //#endregion
