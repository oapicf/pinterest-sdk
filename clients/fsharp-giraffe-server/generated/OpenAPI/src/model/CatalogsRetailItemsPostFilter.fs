namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsRetailItemsPostFilter =

  //#region CatalogsRetailItemsPostFilter

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion

  type CatalogsRetailItemsPostFilter = {
    CatalogType : CatalogTypeEnum;
    ItemIds : string[];
    CatalogId : string;
  }
  //#endregion
