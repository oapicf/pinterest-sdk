namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelBatchItem
open OpenAPI.Model.Country

module CatalogsHotelBatchRequest =

  //#region CatalogsHotelBatchRequest

  [<CLIMutable>]
  type CatalogsHotelBatchRequest = {
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "items")>]
    Items : CatalogsHotelBatchItem[];
    [<JsonProperty(PropertyName = "language")>]
    Language : string;
  }

  //#endregion
