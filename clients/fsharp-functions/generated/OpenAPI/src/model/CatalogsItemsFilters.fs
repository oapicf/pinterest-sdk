namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelItemsFilter
open OpenAPI.Model.CatalogsRetailItemsFilter
open OpenAPI.Model.CatalogsType

module CatalogsItemsFilters =

  //#region CatalogsItemsFilters

  [<CLIMutable>]
  type CatalogsItemsFilters = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "item_ids")>]
    ItemIds : string[];
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "hotel_ids")>]
    HotelIds : string[];
  }

  //#endregion
