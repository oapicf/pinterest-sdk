namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsHotelProductGroupProductCounts =

  //#region CatalogsHotelProductGroupProductCounts

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsHotelProductGroupProductCounts = {
    CatalogType : CatalogTypeEnum;
    Total : decimal;
  }
  //#endregion
