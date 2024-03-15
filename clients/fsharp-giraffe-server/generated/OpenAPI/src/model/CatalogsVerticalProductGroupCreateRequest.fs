namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelProductGroupCreateRequest
open OpenAPI.Model.CatalogsHotelProductGroupFilters
open OpenAPI.Model.string option

module CatalogsVerticalProductGroupCreateRequest =

  //#region CatalogsVerticalProductGroupCreateRequest

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsVerticalProductGroupCreateRequest = {
    CatalogType : CatalogTypeEnum;
    Name : string;
    Description : string option;
    Filters : CatalogsHotelProductGroupFilters;
    CatalogId : string;
  }
  //#endregion
