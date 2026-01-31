namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsHotelItemsPostFilter =

  //#region CatalogsHotelItemsPostFilter

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsHotelItemsPostFilter = {
    CatalogId : string;
    CatalogType : CatalogTypeEnum;
    HotelIds : string[];
  }
  //#endregion
