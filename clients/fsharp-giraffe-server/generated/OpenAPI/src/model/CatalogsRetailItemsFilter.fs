namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsRetailItemsFilter =

  //#region CatalogsRetailItemsFilter

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion

  type CatalogsRetailItemsFilter = {
    CatalogId : string;
    CatalogType : CatalogTypeEnum;
    ItemIds : string[];
  }
  //#endregion
