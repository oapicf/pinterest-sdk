namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.Country
open OpenAPI.Model.ItemUpdateBatchRecord

module CatalogsItemsUpdateBatchRequest =

  //#region CatalogsItemsUpdateBatchRequest


  type CatalogsItemsUpdateBatchRequest = {
    Country : Country;
    Language : CatalogsItemsRequestLanguage;
    Operation : BatchOperation;
    Items : ItemUpdateBatchRecord[];
  }
  //#endregion
