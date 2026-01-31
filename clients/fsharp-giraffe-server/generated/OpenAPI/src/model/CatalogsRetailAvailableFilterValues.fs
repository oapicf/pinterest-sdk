namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsRetailFilterValuesMap

module CatalogsRetailAvailableFilterValues =

  //#region CatalogsRetailAvailableFilterValues

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion

  type CatalogsRetailAvailableFilterValues = {
    CatalogType : CatalogTypeEnum;
    FilterValues : CatalogsRetailFilterValuesMap;
  }
  //#endregion
