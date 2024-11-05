namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsHotelItemsPostFilter =

  //#region CatalogsHotelItemsPostFilter

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsHotelItemsPostFilter = {
    CatalogType : CatalogTypeEnum;
    HotelIds : string[];
    CatalogId : string;
  }
  //#endregion
