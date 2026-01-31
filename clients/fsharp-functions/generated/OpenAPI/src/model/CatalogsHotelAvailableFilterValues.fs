namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelFilterValuesMap

module CatalogsHotelAvailableFilterValues =

  //#region CatalogsHotelAvailableFilterValues

  [<CLIMutable>]
  type CatalogsHotelAvailableFilterValues = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "filter_values")>]
    FilterValues : CatalogsHotelFilterValuesMap;
  }

  //#endregion
