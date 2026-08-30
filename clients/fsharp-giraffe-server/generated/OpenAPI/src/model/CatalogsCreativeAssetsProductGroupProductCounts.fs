namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsCreativeAssetsProductGroupProductCounts =

  //#region CatalogsCreativeAssetsProductGroupProductCounts

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsCreativeAssetsProductGroupProductCounts = {
    AppLinks : decimal;
    CatalogType : CatalogTypeEnum;
    Images : decimal;
    Total : decimal;
    Videos : decimal;
  }
  //#endregion
