namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsRetailFilterValuesMap

module CatalogsRetailAvailableFilterValues =

  //#region CatalogsRetailAvailableFilterValues

  [<CLIMutable>]
  type CatalogsRetailAvailableFilterValues = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "filter_values")>]
    FilterValues : CatalogsRetailFilterValuesMap;
  }

  //#endregion
