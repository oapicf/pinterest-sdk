namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.CatalogsItemsCreateBatchRequest
open OpenAPI.Model.CatalogsItemsDeleteBatchRequest
open OpenAPI.Model.CatalogsItemsDeleteDiscontinuedBatchRequest
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.CatalogsItemsUpdateBatchRequest
open OpenAPI.Model.CatalogsItemsUpsertBatchRequest
open OpenAPI.Model.Country
open OpenAPI.Model.ItemDeleteBatchRecord

module CatalogsItemsBatchRequest =

  //#region CatalogsItemsBatchRequest

  [<CLIMutable>]
  type CatalogsItemsBatchRequest = {
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "language")>]
    Language : CatalogsItemsRequestLanguage;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : BatchOperation;
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemDeleteBatchRecord[];
  }

  //#endregion
