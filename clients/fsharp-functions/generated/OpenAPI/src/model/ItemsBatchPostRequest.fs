namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.CatalogsItemsBatchRequest
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.CatalogsVerticalBatchRequest
open OpenAPI.Model.Country
open OpenAPI.Model.ItemDeleteBatchRecord
open OpenAPI.Model.Language

module ItemsBatchPostRequest =

  //#region ItemsBatchPostRequest

  [<CLIMutable>]
  type ItemsBatchPostRequest = {
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
