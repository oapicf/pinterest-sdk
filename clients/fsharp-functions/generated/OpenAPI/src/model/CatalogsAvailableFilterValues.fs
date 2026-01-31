namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsAvailableFilterValues
open OpenAPI.Model.CatalogsCreativeAssetsFilterValuesMap
open OpenAPI.Model.CatalogsHotelAvailableFilterValues
open OpenAPI.Model.CatalogsRetailAvailableFilterValues

module CatalogsAvailableFilterValues =

  //#region CatalogsAvailableFilterValues

  [<CLIMutable>]
  type CatalogsAvailableFilterValues = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "filter_values")>]
    FilterValues : CatalogsCreativeAssetsFilterValuesMap;
  }

  //#endregion
