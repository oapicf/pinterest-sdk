namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelProductGroupFilters
open OpenAPI.Model.string option

module CatalogsHotelProductGroupCreateRequest =

  //#region CatalogsHotelProductGroupCreateRequest

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsHotelProductGroupCreateRequest = {
    CatalogId : string;
    CatalogType : CatalogTypeEnum;
    Description : string option;
    Filters : CatalogsHotelProductGroupFilters;
    Name : string;
  }
  //#endregion
