namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.Country
open OpenAPI.Model.ItemDeleteBatchRecord

module CatalogsItemsDeleteBatchRequest =

  //#region CatalogsItemsDeleteBatchRequest

  [<CLIMutable>]
  type CatalogsItemsDeleteBatchRequest = {
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemDeleteBatchRecord[];
    [<JsonProperty(PropertyName = "language")>]
    Language : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : BatchOperation;
  }

  //#endregion
