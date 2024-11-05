namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsHotelProductGroupProductCounts =

  //#region CatalogsHotelProductGroupProductCounts

  [<CLIMutable>]
  type CatalogsHotelProductGroupProductCounts = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "total")>]
    Total : decimal;
  }

  //#endregion
