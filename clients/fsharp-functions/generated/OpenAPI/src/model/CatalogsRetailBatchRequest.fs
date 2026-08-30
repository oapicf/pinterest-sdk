namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsRetailBatchRequestItemsItems
open OpenAPI.Model.Country

module CatalogsRetailBatchRequest =

  //#region CatalogsRetailBatchRequest

  [<CLIMutable>]
  type CatalogsRetailBatchRequest = {
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "items")>]
    Items : CatalogsRetailBatchRequestItemsItems[];
    [<JsonProperty(PropertyName = "language")>]
    Language : string;
  }

  //#endregion
