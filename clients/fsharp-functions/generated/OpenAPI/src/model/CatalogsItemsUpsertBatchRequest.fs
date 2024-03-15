namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.Country
open OpenAPI.Model.ItemUpsertBatchRecord
open OpenAPI.Model.Language

module CatalogsItemsUpsertBatchRequest =

  //#region CatalogsItemsUpsertBatchRequest

  [<CLIMutable>]
  type CatalogsItemsUpsertBatchRequest = {
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "language")>]
    Language : Language;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : BatchOperation;
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemUpsertBatchRecord[];
  }

  //#endregion
