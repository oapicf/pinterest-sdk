namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelProductGroupFilters
open OpenAPI.Model.CatalogsHotelProductGroupUpdateRequest
open OpenAPI.Model.string option

module CatalogsVerticalProductGroupUpdateRequest =

  //#region CatalogsVerticalProductGroupUpdateRequest

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsVerticalProductGroupUpdateRequest = {
    CatalogType : CatalogTypeEnum;
    Name : string;
    Description : string option;
    Filters : CatalogsHotelProductGroupFilters;
  }
  //#endregion
