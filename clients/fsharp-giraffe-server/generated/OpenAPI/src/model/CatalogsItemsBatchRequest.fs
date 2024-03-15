namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.CatalogsItemsCreateBatchRequest
open OpenAPI.Model.CatalogsItemsDeleteBatchRequest
open OpenAPI.Model.CatalogsItemsDeleteDiscontinuedBatchRequest
open OpenAPI.Model.CatalogsItemsUpdateBatchRequest
open OpenAPI.Model.CatalogsItemsUpsertBatchRequest
open OpenAPI.Model.Country
open OpenAPI.Model.ItemDeleteBatchRecord
open OpenAPI.Model.Language

module CatalogsItemsBatchRequest =

  //#region CatalogsItemsBatchRequest


  type CatalogsItemsBatchRequest = {
    Country : Country;
    Language : Language;
    Operation : BatchOperation;
    Items : ItemDeleteBatchRecord[];
  }
  //#endregion
