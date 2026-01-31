namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsFilterValuesMap

module CatalogsCreativeAssetsAvailableFilterValues =

  //#region CatalogsCreativeAssetsAvailableFilterValues

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsCreativeAssetsAvailableFilterValues = {
    CatalogType : CatalogTypeEnum;
    FilterValues : CatalogsCreativeAssetsFilterValuesMap;
  }
  //#endregion
