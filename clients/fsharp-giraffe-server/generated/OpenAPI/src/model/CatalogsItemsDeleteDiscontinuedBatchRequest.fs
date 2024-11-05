namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.Country
open OpenAPI.Model.ItemDeleteDiscontinuedBatchRecord

module CatalogsItemsDeleteDiscontinuedBatchRequest =

  //#region CatalogsItemsDeleteDiscontinuedBatchRequest


  type CatalogsItemsDeleteDiscontinuedBatchRequest = {
    Country : Country;
    Language : CatalogsItemsRequestLanguage;
    Operation : BatchOperation;
    Items : ItemDeleteDiscontinuedBatchRecord[];
  }
  //#endregion
