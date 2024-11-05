namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsCreativeAssetsItemsPostFilter =

  //#region CatalogsCreativeAssetsItemsPostFilter

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsCreativeAssetsItemsPostFilter = {
    CatalogType : CatalogTypeEnum;
    CreativeAssetsIds : string[];
    CatalogId : string;
  }
  //#endregion
