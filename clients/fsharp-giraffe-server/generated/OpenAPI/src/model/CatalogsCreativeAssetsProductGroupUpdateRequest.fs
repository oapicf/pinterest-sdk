namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFilters
open OpenAPI.Model.string option

module CatalogsCreativeAssetsProductGroupUpdateRequest =

  //#region CatalogsCreativeAssetsProductGroupUpdateRequest

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsCreativeAssetsProductGroupUpdateRequest = {
    CatalogType : CatalogTypeEnum;
    Name : string;
    Description : string option;
    Filters : CatalogsCreativeAssetsProductGroupFilters;
  }
  //#endregion
