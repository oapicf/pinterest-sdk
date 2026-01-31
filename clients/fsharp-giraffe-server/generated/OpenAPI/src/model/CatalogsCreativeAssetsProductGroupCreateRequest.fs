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
    CatalogId : string;
    CatalogType : CatalogTypeEnum;
    Description : string option;
    Filters : CatalogsCreativeAssetsProductGroupFilters;
    Name : string;
  }
  //#endregion
