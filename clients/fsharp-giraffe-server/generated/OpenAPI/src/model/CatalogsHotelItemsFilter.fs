namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsHotelItemsFilter =

  //#region CatalogsHotelItemsFilter

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsHotelItemsFilter = {
    CatalogType : CatalogTypeEnum;
    HotelIds : string[];
    CatalogId : string;
  }
  //#endregion
