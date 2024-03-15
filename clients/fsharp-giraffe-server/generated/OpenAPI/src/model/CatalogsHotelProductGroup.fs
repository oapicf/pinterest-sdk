namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelProductGroupFilters
open OpenAPI.Model.string option

module CatalogsHotelProductGroup =

  //#region CatalogsHotelProductGroup

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsHotelProductGroup = {
    CatalogType : CatalogTypeEnum;
    Id : string;
    Name : string;
    Description : string option;
    Filters : CatalogsHotelProductGroupFilters;
    CreatedAt : int;
    UpdatedAt : int;
    CatalogId : string;
  }
  //#endregion
