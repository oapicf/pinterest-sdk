namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsType

module CatalogsCreateRequest =

  //#region CatalogsCreateRequest


  type CatalogsCreateRequest = {
    CatalogType : CatalogsType;
    Name : string;
  }
  //#endregion
