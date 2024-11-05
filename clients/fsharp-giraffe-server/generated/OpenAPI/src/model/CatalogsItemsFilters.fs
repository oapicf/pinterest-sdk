namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsItemsFilter
open OpenAPI.Model.CatalogsHotelItemsFilter
open OpenAPI.Model.CatalogsRetailItemsFilter
open OpenAPI.Model.CatalogsType

module CatalogsItemsFilters =

  //#region CatalogsItemsFilters


  type CatalogsItemsFilters = {
    CatalogType : CatalogsType;
    ItemIds : string[];
    CatalogId : string;
    HotelIds : string[];
    CreativeAssetsIds : string[];
  }
  //#endregion
