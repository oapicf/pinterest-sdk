namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Country
open OpenAPI.Model.ItemUpsertBatchRecord

module CatalogsItemsUpsertBatchRequest =

  //#region CatalogsItemsUpsertBatchRequest

  [<CLIMutable>]
  type CatalogsItemsUpsertBatchRequest = {
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemUpsertBatchRecord[];
    [<JsonProperty(PropertyName = "language")>]
    Language : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
  }

  //#endregion
