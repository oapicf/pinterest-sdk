namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.Country
open OpenAPI.Model.ItemBatchRecord
open OpenAPI.Model.Language

module CatalogsItemsBatchRequest =

  //#region CatalogsItemsBatchRequest


  type CatalogsItemsBatchRequest = {
    Country : Country;
    Language : Language;
    Operation : BatchOperation;
    Items : ItemBatchRecord[];
  }
  //#endregion
