namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsRetailItemsFilter =

  //#region CatalogsRetailItemsFilter

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion

  type CatalogsRetailItemsFilter = {
    CatalogType : CatalogTypeEnum;
    ItemIds : string[];
    CatalogId : string;
  }
  //#endregion
