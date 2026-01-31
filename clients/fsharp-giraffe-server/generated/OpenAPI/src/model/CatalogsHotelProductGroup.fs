namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelProductGroupFilters
open OpenAPI.Model.CatalogsHotelProductGroupType
open OpenAPI.Model.string option

module CatalogsHotelProductGroup =

  //#region CatalogsHotelProductGroup

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsHotelProductGroup = {
    CatalogId : string;
    CatalogType : CatalogTypeEnum;
    CreatedAt : int;
    Description : string option;
    Filters : CatalogsHotelProductGroupFilters;
    Id : string;
    Name : string;
    Type : CatalogsHotelProductGroupType;
    UpdatedAt : int;
  }
  //#endregion
