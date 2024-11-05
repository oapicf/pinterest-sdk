namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsCreativeAssetsProductGroupProductCounts =

  //#region CatalogsCreativeAssetsProductGroupProductCounts

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsCreativeAssetsProductGroupProductCounts = {
    CatalogType : CatalogTypeEnum;
    Total : decimal;
    Videos : decimal;
  }
  //#endregion
