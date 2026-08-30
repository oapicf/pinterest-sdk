namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Country
open OpenAPI.Model.ItemUpdateBatchRecord

module CatalogsItemsUpdateBatchRequest =

  //#region CatalogsItemsUpdateBatchRequest

  [<CLIMutable>]
  type CatalogsItemsUpdateBatchRequest = {
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemUpdateBatchRecord[];
    [<JsonProperty(PropertyName = "language")>]
    Language : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
  }

  //#endregion
