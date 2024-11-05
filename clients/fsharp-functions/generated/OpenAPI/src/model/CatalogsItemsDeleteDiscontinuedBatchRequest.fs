namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.Country
open OpenAPI.Model.ItemDeleteDiscontinuedBatchRecord

module CatalogsItemsDeleteDiscontinuedBatchRequest =

  //#region CatalogsItemsDeleteDiscontinuedBatchRequest

  [<CLIMutable>]
  type CatalogsItemsDeleteDiscontinuedBatchRequest = {
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "language")>]
    Language : CatalogsItemsRequestLanguage;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : BatchOperation;
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemDeleteDiscontinuedBatchRecord[];
  }

  //#endregion
