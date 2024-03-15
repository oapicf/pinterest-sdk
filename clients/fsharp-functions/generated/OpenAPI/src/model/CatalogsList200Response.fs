namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Catalog
open OpenAPI.Model.string option

module CatalogsList200Response =

  //#region CatalogsList200Response

  [<CLIMutable>]
  type CatalogsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : Catalog[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
