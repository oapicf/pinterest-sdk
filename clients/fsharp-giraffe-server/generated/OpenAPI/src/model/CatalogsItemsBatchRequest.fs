namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.CatalogsItemsCreateBatchRequest
open OpenAPI.Model.CatalogsItemsDeleteBatchRequest
open OpenAPI.Model.CatalogsItemsDeleteDiscontinuedBatchRequest
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.CatalogsItemsUpdateBatchRequest
open OpenAPI.Model.CatalogsItemsUpsertBatchRequest
open OpenAPI.Model.Country
open OpenAPI.Model.ItemDeleteBatchRecord

module CatalogsItemsBatchRequest =

  //#region CatalogsItemsBatchRequest


  type CatalogsItemsBatchRequest = {
    Country : Country;
    Language : CatalogsItemsRequestLanguage;
    Operation : BatchOperation;
    Items : ItemDeleteBatchRecord[];
  }
  //#endregion
