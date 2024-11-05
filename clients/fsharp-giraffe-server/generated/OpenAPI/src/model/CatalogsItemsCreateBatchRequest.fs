namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.Country
open OpenAPI.Model.ItemCreateBatchRecord

module CatalogsItemsCreateBatchRequest =

  //#region CatalogsItemsCreateBatchRequest


  type CatalogsItemsCreateBatchRequest = {
    Country : Country;
    Language : CatalogsItemsRequestLanguage;
    Operation : BatchOperation;
    Items : ItemCreateBatchRecord[];
  }
  //#endregion
