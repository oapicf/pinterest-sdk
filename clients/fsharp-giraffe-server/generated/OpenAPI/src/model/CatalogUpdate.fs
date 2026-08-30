namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsType

module CatalogUpdate =

  //#region CatalogUpdate


  type CatalogUpdate = {
    CatalogType : CatalogsType;
    Name : string;
  }
  //#endregion
