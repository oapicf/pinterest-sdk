namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFilters
open OpenAPI.Model.string option

module CatalogsCreativeAssetsProductGroupCreateRequest =

  //#region CatalogsCreativeAssetsProductGroupCreateRequest

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsCreativeAssetsProductGroupCreateRequest = {
    CatalogType : CatalogTypeEnum;
    Name : string;
    Description : string option;
    Filters : CatalogsCreativeAssetsProductGroupFilters;
    CatalogId : string;
  }
  //#endregion
