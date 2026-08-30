namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Country
open OpenAPI.Model.ItemDeleteDiscontinuedBatchRecord

module CatalogsItemsDeleteDiscontinuedBatchRequest =

  //#region CatalogsItemsDeleteDiscontinuedBatchRequest

  [<CLIMutable>]
  type CatalogsItemsDeleteDiscontinuedBatchRequest = {
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemDeleteDiscontinuedBatchRecord[];
    [<JsonProperty(PropertyName = "language")>]
    Language : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
  }

  //#endregion
