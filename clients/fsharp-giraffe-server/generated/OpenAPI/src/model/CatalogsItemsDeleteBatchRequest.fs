namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.Country
open OpenAPI.Model.ItemDeleteBatchRecord

module CatalogsItemsDeleteBatchRequest =

  //#region CatalogsItemsDeleteBatchRequest


  type CatalogsItemsDeleteBatchRequest = {
    Country : Country;
    Language : CatalogsItemsRequestLanguage;
    Operation : BatchOperation;
    Items : ItemDeleteBatchRecord[];
  }
  //#endregion
