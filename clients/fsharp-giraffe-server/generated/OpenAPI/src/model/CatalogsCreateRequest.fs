namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsCreateRequest =

  //#region CatalogsCreateRequest

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsCreateRequest = {
    CatalogType : CatalogTypeEnum;
    Name : string;
  }
  //#endregion
