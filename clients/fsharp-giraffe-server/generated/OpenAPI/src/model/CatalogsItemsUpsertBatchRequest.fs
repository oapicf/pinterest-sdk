namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.Country
open OpenAPI.Model.ItemUpsertBatchRecord
open OpenAPI.Model.Language

module CatalogsItemsUpsertBatchRequest =

  //#region CatalogsItemsUpsertBatchRequest


  type CatalogsItemsUpsertBatchRequest = {
    Country : Country;
    Language : Language;
    Operation : BatchOperation;
    Items : ItemUpsertBatchRecord[];
  }
  //#endregion
