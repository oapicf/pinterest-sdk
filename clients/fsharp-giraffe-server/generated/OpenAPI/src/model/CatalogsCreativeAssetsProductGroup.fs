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
    CatalogId : string;
    CatalogType : CatalogTypeEnum;
    CreatedAt : int;
    Description : string option;
    Filters : CatalogsCreativeAssetsProductGroupFilters;
    Id : string;
    Name : string;
    UpdatedAt : int;
  }
  //#endregion
