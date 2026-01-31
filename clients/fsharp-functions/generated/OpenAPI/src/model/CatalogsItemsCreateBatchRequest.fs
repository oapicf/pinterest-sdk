namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.Country
open OpenAPI.Model.ItemCreateBatchRecord

module CatalogsItemsCreateBatchRequest =

  //#region CatalogsItemsCreateBatchRequest

  [<CLIMutable>]
  type CatalogsItemsCreateBatchRequest = {
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemCreateBatchRecord[];
    [<JsonProperty(PropertyName = "language")>]
    Language : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : BatchOperation;
  }

  //#endregion
