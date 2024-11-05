namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsHotelItemsPostFilter =

  //#region CatalogsHotelItemsPostFilter

  [<CLIMutable>]
  type CatalogsHotelItemsPostFilter = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "hotel_ids")>]
    HotelIds : string[];
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
  }

  //#endregion
