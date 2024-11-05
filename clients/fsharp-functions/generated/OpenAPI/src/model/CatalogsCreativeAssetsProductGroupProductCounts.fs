namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsCreativeAssetsProductGroupProductCounts =

  //#region CatalogsCreativeAssetsProductGroupProductCounts

  [<CLIMutable>]
  type CatalogsCreativeAssetsProductGroupProductCounts = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "total")>]
    Total : decimal;
    [<JsonProperty(PropertyName = "videos")>]
    Videos : decimal;
  }

  //#endregion
