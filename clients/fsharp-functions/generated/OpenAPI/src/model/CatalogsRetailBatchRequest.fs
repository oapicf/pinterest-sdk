namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.CatalogsRetailBatchRequestItemsInner
open OpenAPI.Model.Country

module CatalogsRetailBatchRequest =

  //#region CatalogsRetailBatchRequest

  [<CLIMutable>]
  type CatalogsRetailBatchRequest = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "language")>]
    Language : CatalogsItemsRequestLanguage;
    [<JsonProperty(PropertyName = "items")>]
    Items : CatalogsRetailBatchRequestItemsInner[];
  }

  //#endregion
