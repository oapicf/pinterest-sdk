namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFilters
open OpenAPI.Model.string option

module CatalogsCreativeAssetsProductGroup =

  //#region CatalogsCreativeAssetsProductGroup

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsCreativeAssetsProductGroup = {
    CatalogType : CatalogTypeEnum;
    Id : string;
    Name : string;
    Description : string option;
    Filters : CatalogsCreativeAssetsProductGroupFilters;
    CreatedAt : int;
    UpdatedAt : int;
    CatalogId : string;
  }
  //#endregion
