namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsItemsPostFilter
open OpenAPI.Model.CatalogsHotelItemsPostFilter
open OpenAPI.Model.CatalogsRetailItemsPostFilter
open OpenAPI.Model.CatalogsType

module CatalogsItemsPostFilters =

  //#region CatalogsItemsPostFilters

  [<CLIMutable>]
  type CatalogsItemsPostFilters = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "item_ids")>]
    ItemIds : string[];
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "hotel_ids")>]
    HotelIds : string[];
    [<JsonProperty(PropertyName = "creative_assets_ids")>]
    CreativeAssetsIds : string[];
  }

  //#endregion
