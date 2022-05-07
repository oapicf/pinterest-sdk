namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.Country
open OpenAPI.Model.ItemBatchRecord
open OpenAPI.Model.Language

module CatalogsItemsBatchRequest =

  //#region CatalogsItemsBatchRequest

  [<CLIMutable>]
  type CatalogsItemsBatchRequest = {
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "language")>]
    Language : Language;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : BatchOperation;
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemBatchRecord[];
  }

  //#endregion
