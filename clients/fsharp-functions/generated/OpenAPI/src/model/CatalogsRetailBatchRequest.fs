namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsRetailBatchRequestItemsInner
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.Country
open OpenAPI.Model.Language

module CatalogsRetailBatchRequest =

  //#region CatalogsRetailBatchRequest

  [<CLIMutable>]
  type CatalogsRetailBatchRequest = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "language")>]
    Language : Language;
    [<JsonProperty(PropertyName = "items")>]
    Items : CatalogsRetailBatchRequestItemsInner[];
  }

  //#endregion
