namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsHotelItemsFilter =

  //#region CatalogsHotelItemsFilter

  [<CLIMutable>]
  type CatalogsHotelItemsFilter = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "hotel_ids")>]
    HotelIds : string[];
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
  }

  //#endregion
