namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.Country
open OpenAPI.Model.ItemDeleteBatchRecord
open OpenAPI.Model.Language

module CatalogsItemsDeleteBatchRequest =

  //#region CatalogsItemsDeleteBatchRequest


  type CatalogsItemsDeleteBatchRequest = {
    Country : Country;
    Language : Language;
    Operation : BatchOperation;
    Items : ItemDeleteBatchRecord[];
  }
  //#endregion
