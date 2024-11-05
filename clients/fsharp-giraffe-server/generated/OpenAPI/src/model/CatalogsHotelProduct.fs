namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelProductMetadata
open OpenAPI.Model.Pin

module CatalogsHotelProduct =

  //#region CatalogsHotelProduct

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsHotelProduct = {
    CatalogType : CatalogTypeEnum;
    Metadata : CatalogsHotelProductMetadata;
    Pin : Pin;
  }
  //#endregion
