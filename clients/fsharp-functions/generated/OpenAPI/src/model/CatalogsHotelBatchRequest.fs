namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelBatchItem
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.Country

module CatalogsHotelBatchRequest =

  //#region CatalogsHotelBatchRequest

  [<CLIMutable>]
  type CatalogsHotelBatchRequest = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "language")>]
    Language : CatalogsItemsRequestLanguage;
    [<JsonProperty(PropertyName = "items")>]
    Items : CatalogsHotelBatchItem[];
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
  }

  //#endregion
