namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsItemsPostFilter
open OpenAPI.Model.CatalogsHotelItemsPostFilter
open OpenAPI.Model.CatalogsRetailItemsPostFilter

module CatalogsItemsPostFilters =

  //#region CatalogsItemsPostFilters

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsItemsPostFilters = {
    CatalogId : string;
    CatalogType : CatalogTypeEnum;
    ItemIds : string[];
    HotelIds : string[];
    CreativeAssetsIds : string[];
  }
  //#endregion
