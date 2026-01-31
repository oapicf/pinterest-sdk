namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsFilterValuesMap

module CatalogsCreativeAssetsAvailableFilterValues =

  //#region CatalogsCreativeAssetsAvailableFilterValues

  [<CLIMutable>]
  type CatalogsCreativeAssetsAvailableFilterValues = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "filter_values")>]
    FilterValues : CatalogsCreativeAssetsFilterValuesMap;
  }

  //#endregion
