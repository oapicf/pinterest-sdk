namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelFilterValuesMap

module CatalogsHotelAvailableFilterValues =

  //#region CatalogsHotelAvailableFilterValues

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsHotelAvailableFilterValues = {
    CatalogType : CatalogTypeEnum;
    FilterValues : CatalogsHotelFilterValuesMap;
  }
  //#endregion
