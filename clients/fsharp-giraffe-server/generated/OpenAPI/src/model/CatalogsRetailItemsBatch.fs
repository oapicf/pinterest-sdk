namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperationStatus
open OpenAPI.Model.ItemProcessingRecord

module CatalogsRetailItemsBatch =

  //#region CatalogsRetailItemsBatch

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion

  type CatalogsRetailItemsBatch = {
    BatchId : string;
    CatalogType : CatalogTypeEnum;
    CompletedTime : Nullable<DateTime>;
    CreatedTime : DateTime;
    Items : ItemProcessingRecord[];
    Status : BatchOperationStatus;
  }
  //#endregion
