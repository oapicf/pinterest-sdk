namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.Country
open OpenAPI.Model.ItemDeleteBatchRecord
open OpenAPI.Model.Language

module CatalogsItemsDeleteBatchRequest =

  //#region CatalogsItemsDeleteBatchRequest

  [<CLIMutable>]
  type CatalogsItemsDeleteBatchRequest = {
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "language")>]
    Language : Language;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : BatchOperation;
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemDeleteBatchRecord[];
  }

  //#endregion
