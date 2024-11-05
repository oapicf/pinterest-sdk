namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsCreativeAssetsItemsFilter =

  //#region CatalogsCreativeAssetsItemsFilter

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsCreativeAssetsItemsFilter = {
    CatalogType : CatalogTypeEnum;
    CreativeAssetsIds : string[];
    CatalogId : string;
  }
  //#endregion
