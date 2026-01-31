namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsType

module CatalogsCreateRequest =

  //#region CatalogsCreateRequest

  [<CLIMutable>]
  type CatalogsCreateRequest = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
