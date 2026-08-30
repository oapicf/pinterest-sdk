namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsProduct
open OpenAPI.Model.CatalogsCreativeAssetsProductMetadata
open OpenAPI.Model.CatalogsHotelProduct
open OpenAPI.Model.CatalogsRetailProduct
open OpenAPI.Model.Pin

module CatalogsProduct =

  //#region CatalogsProduct

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsProduct = {
    CatalogType : CatalogTypeEnum;
    Metadata : CatalogsCreativeAssetsProductMetadata;
    Pin : Pin;
  }
  //#endregion
