namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFilters

module CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest =

  //#region CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest = {
    CatalogType : CatalogTypeEnum;
    CatalogId : string;
    Filters : CatalogsCreativeAssetsProductGroupFilters;
  }
  //#endregion
