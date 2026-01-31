namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelProductGroupFilters
open OpenAPI.Model.string option

module CatalogsHotelProductGroupUpdateRequest =

  //#region CatalogsHotelProductGroupUpdateRequest

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsHotelProductGroupUpdateRequest = {
    CatalogType : CatalogTypeEnum;
    Description : string option;
    Filters : CatalogsHotelProductGroupFilters;
    Name : string;
  }
  //#endregion
