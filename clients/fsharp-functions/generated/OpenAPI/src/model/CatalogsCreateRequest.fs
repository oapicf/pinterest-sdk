namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsCreateRequest =

  //#region CatalogsCreateRequest

  [<CLIMutable>]
  type CatalogsCreateRequest = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
