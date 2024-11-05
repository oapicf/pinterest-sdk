namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.Country
open OpenAPI.Model.ItemCreateBatchRecord

module CatalogsItemsCreateBatchRequest =

  //#region CatalogsItemsCreateBatchRequest

  [<CLIMutable>]
  type CatalogsItemsCreateBatchRequest = {
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "language")>]
    Language : CatalogsItemsRequestLanguage;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : BatchOperation;
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemCreateBatchRecord[];
  }

  //#endregion
