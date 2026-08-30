namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupProductCounts
open OpenAPI.Model.CatalogsHotelProductGroupProductCounts
open OpenAPI.Model.CatalogsRetailProductGroupProductCounts

module CatalogsProductGroupProductCountsVertical =

  //#region CatalogsProductGroupProductCountsVertical

  [<CLIMutable>]
  type CatalogsProductGroupProductCountsVertical = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "in_stock")>]
    InStock : decimal;
    [<JsonProperty(PropertyName = "out_of_stock")>]
    OutOfStock : decimal;
    [<JsonProperty(PropertyName = "preorder")>]
    Preorder : decimal;
    [<JsonProperty(PropertyName = "total")>]
    Total : decimal;
    [<JsonProperty(PropertyName = "videos")>]
    Videos : decimal;
    [<JsonProperty(PropertyName = "app_links")>]
    AppLinks : decimal;
    [<JsonProperty(PropertyName = "images")>]
    Images : decimal;
  }

  //#endregion
