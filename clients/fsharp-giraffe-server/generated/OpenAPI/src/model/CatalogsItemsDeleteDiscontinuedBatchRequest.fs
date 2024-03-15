namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.Country
open OpenAPI.Model.ItemDeleteDiscontinuedBatchRecord
open OpenAPI.Model.Language

module CatalogsItemsDeleteDiscontinuedBatchRequest =

  //#region CatalogsItemsDeleteDiscontinuedBatchRequest


  type CatalogsItemsDeleteDiscontinuedBatchRequest = {
    Country : Country;
    Language : Language;
    Operation : BatchOperation;
    Items : ItemDeleteDiscontinuedBatchRecord[];
  }
  //#endregion
