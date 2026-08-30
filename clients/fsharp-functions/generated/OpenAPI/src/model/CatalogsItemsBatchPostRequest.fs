namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsItemsBatchRequest
open OpenAPI.Model.CatalogsVerticalBatchRequest
open OpenAPI.Model.Country
open OpenAPI.Model.ItemDeleteBatchRecord

module CatalogsItemsBatchPostRequest =

  //#region CatalogsItemsBatchPostRequest

  [<CLIMutable>]
  type CatalogsItemsBatchPostRequest = {
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemDeleteBatchRecord[];
    [<JsonProperty(PropertyName = "language")>]
    Language : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
  }

  //#endregion
