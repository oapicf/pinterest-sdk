namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelProductGroupFilters

module CatalogsHotelListProductsByCatalogBasedFilterRequest =

  //#region CatalogsHotelListProductsByCatalogBasedFilterRequest

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsHotelListProductsByCatalogBasedFilterRequest = {
    CatalogType : CatalogTypeEnum;
    CatalogId : string;
    Filters : CatalogsHotelProductGroupFilters;
  }
  //#endregion
