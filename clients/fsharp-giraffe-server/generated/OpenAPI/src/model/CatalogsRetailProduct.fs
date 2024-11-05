namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsRetailProductMetadata
open OpenAPI.Model.Pin

module CatalogsRetailProduct =

  //#region CatalogsRetailProduct

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion

  type CatalogsRetailProduct = {
    CatalogType : CatalogTypeEnum;
    Metadata : CatalogsRetailProductMetadata;
    Pin : Pin;
  }
  //#endregion
