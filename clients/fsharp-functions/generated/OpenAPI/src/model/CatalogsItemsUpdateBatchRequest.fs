namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.Country
open OpenAPI.Model.ItemUpdateBatchRecord

module CatalogsItemsUpdateBatchRequest =

  //#region CatalogsItemsUpdateBatchRequest

  [<CLIMutable>]
  type CatalogsItemsUpdateBatchRequest = {
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "language")>]
    Language : CatalogsItemsRequestLanguage;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : BatchOperation;
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemUpdateBatchRecord[];
  }

  //#endregion
