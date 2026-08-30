namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsType

module CatalogCreate =

  //#region CatalogCreate


  type CatalogCreate = {
    CatalogType : CatalogsType;
    Name : string;
  }
  //#endregion
