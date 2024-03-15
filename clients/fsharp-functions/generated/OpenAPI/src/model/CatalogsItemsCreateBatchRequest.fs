namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.Country
open OpenAPI.Model.ItemCreateBatchRecord
open OpenAPI.Model.Language

module CatalogsItemsCreateBatchRequest =

  //#region CatalogsItemsCreateBatchRequest

  [<CLIMutable>]
  type CatalogsItemsCreateBatchRequest = {
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "language")>]
    Language : Language;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : BatchOperation;
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemCreateBatchRecord[];
  }

  //#endregion
