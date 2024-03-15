namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.Country
open OpenAPI.Model.ItemCreateBatchRecord
open OpenAPI.Model.Language

module CatalogsItemsCreateBatchRequest =

  //#region CatalogsItemsCreateBatchRequest


  type CatalogsItemsCreateBatchRequest = {
    Country : Country;
    Language : Language;
    Operation : BatchOperation;
    Items : ItemCreateBatchRecord[];
  }
  //#endregion
