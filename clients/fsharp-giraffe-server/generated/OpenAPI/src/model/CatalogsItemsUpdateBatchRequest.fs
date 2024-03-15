namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.Country
open OpenAPI.Model.ItemUpdateBatchRecord
open OpenAPI.Model.Language

module CatalogsItemsUpdateBatchRequest =

  //#region CatalogsItemsUpdateBatchRequest


  type CatalogsItemsUpdateBatchRequest = {
    Country : Country;
    Language : Language;
    Operation : BatchOperation;
    Items : ItemUpdateBatchRecord[];
  }
  //#endregion
