namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsItemsPostFilter
open OpenAPI.Model.CatalogsHotelItemsPostFilter
open OpenAPI.Model.CatalogsRetailItemsPostFilter
open OpenAPI.Model.CatalogsType

module CatalogsItemsPostFilters =

  //#region CatalogsItemsPostFilters


  type CatalogsItemsPostFilters = {
    CatalogType : CatalogsType;
    ItemIds : string[];
    CatalogId : string;
    HotelIds : string[];
    CreativeAssetsIds : string[];
  }
  //#endregion
