namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.Country
open OpenAPI.Model.ItemUpsertBatchRecord

module CatalogsItemsUpsertBatchRequest =

  //#region CatalogsItemsUpsertBatchRequest


  type CatalogsItemsUpsertBatchRequest = {
    Country : Country;
    Language : CatalogsItemsRequestLanguage;
    Operation : BatchOperation;
    Items : ItemUpsertBatchRecord[];
  }
  //#endregion
