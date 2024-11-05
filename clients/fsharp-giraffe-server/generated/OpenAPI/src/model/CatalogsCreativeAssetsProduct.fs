namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsProductMetadata
open OpenAPI.Model.Pin

module CatalogsCreativeAssetsProduct =

  //#region CatalogsCreativeAssetsProduct

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsCreativeAssetsProduct = {
    CatalogType : CatalogTypeEnum;
    Metadata : CatalogsCreativeAssetsProductMetadata;
    Pin : Pin;
  }
  //#endregion
