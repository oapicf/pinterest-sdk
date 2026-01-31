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
    CatalogType : CatalogsType;
    CompletedTime : Nullable<DateTime>;
    CreatedTime : DateTime;
    Items : ItemProcessingRecord[];
    Status : BatchOperationStatus;
  }
  //#endregion
