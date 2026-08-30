namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsType

module CatalogCreate =

  //#region CatalogCreate

  [<CLIMutable>]
  type CatalogCreate = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
